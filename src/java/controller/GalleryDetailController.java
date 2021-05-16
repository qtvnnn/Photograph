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
import entity.ImageGallery;
import entity.Share;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modal.GalleryDAO;
import modal.ImageGalleryDAO;
import modal.ShareDAO;

/**
 *
 * @author User
 */
public class GalleryDetailController extends HttpServlet {

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
            int pageSize = 8;
//            get page current
            int page = 0;
            try {
                page = Integer.parseInt(request.getParameter("page"));
            } catch (NumberFormatException ex) {
                page = 1;
            }
            if (page <= 0) {
                page = 1;
            }
//            Get the ID of the gallery  wants to see in detail
            int id = 0;
            try {
                id = Integer.parseInt(request.getParameter("id"));
            } catch (NumberFormatException e) {
                id = -1;
            }
            GalleryDAO ga = new GalleryDAO();
//            get Top 3 gallery for header
            ArrayList<Gallery> top3gallery = ga.getTop3Gallerys();
            request.setAttribute("Top3Gallery", top3gallery);         
//            big image
            request.setAttribute("galleryCurrent", ga.getGalleryByID(id));
            request.setAttribute("id", id);
//            get image gallery to paging
            ImageGalleryDAO imgDAO = new ImageGalleryDAO();
            ArrayList<ImageGallery> imgGalleryList = imgDAO.getImageGalleryPaging(id, pageSize, page);
            request.setAttribute("imgGalleryList", imgGalleryList);
            if (imgGalleryList.size() != 0) {              
//            get number page
                int numberPage = imgDAO.getNumberPages(id, pageSize);
                request.setAttribute("numberPage", numberPage);
                request.setAttribute("page", page);
            }

//            get link share
            ShareDAO share = new ShareDAO();
            ArrayList<Share> shareList = share.getShare();
            request.setAttribute("ShareList", shareList);

            

            request.getRequestDispatcher("galleryDetail.jsp").forward(request, response);
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
