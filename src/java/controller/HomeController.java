/**
 * Copyright (C) 2021, FPT University
 * J3.L.P0017
 * Photographer
 * 
 * Record of change:
 * DATE         Version             Author          DESCRIPTION
 * 2021-05-13   1.0                 NangNN          First Version
 */
package controller;

import entity.Gallery;
import entity.Introduction;
import entity.Share;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modal.GalleryDAO;
import modal.IntroductionDAO;
import modal.ShareDAO;

/**
 *
 * @author User
 */
public class HomeController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            int pageSize = 3;
            // get page current
            int page = 0;
            try {
                page = Integer.parseInt(request.getParameter("page"));
            } catch (NumberFormatException ex) {
                page = 1;
            }
            if (page <= 0) {
                page = 1;
            }
            
            GalleryDAO ga = new GalleryDAO();
            
            // get Top 3 gallery for header
            ArrayList<Gallery> top3gallery = ga.getTop3Gallerys();
            request.setAttribute("Top3Gallery", top3gallery);

            // get introduction in home page
            IntroductionDAO introDAO = new IntroductionDAO();
            Introduction intro = introDAO.getIntroduction();
            request.setAttribute("Introduction", intro);

            // paging get gallery in page with 3 galleries
            ArrayList<Gallery> gaList = ga.getGallerys(pageSize, page);
            request.setAttribute("PagingGallery", gaList);
            if (gaList.size() != 0) {
            // get number page
                int numberPage = ga.getNumberPages(pageSize);
                request.setAttribute("numberPage", numberPage);
                request.setAttribute("page", page);
            }
            
            // get link share
            ShareDAO share = new ShareDAO();
            ArrayList<Share> shareList = share.getShare();
            request.setAttribute("ShareList", shareList);

            request.setAttribute("boldHome", "font-bold");

            request.getRequestDispatcher("index.jsp").forward(request, response);

        } catch (Exception e) {
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
