/**
 * Copyright (C) 2021, FPT University<br>
 * J3.L.P0017<br>
 * Photographer<br>
 *
 * Record of change:<br>
 * DATE ------- Version ----------- Author -------- DESCRIPTION<br>
 * 2021-05-13 - 1.0 --------------- NangNN -------- First Version<br>
 */
package controller;

import dao.IGalleryDAO;
import dao.IInfomationDAO;
import dao.IShareDAO;
import entity.Gallery;
import entity.Share;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.impl.GalleryDAOImpl;
import dao.impl.InformationDAOImpl;
import dao.impl.ShareDAOImpl;

/**
 * Process:<br>
 * - Get Top 3 galleries for header<br>
 * - Get information<br>
 * - Get link share<br>
 *
 * Exception:<br>
 * - If output failed, it will return to error page.
 *
 * @author nangnnhe130538
 */
public class ContactController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request. It is a object of
     * <code>javax.servlet.http.HttpServletRequest</code>
     * @param response It is a object of
     * <code>javax.servlet.http.HttpServletResponse</code>
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // get Top 3 gallery for header
            IGalleryDAO galleryDAO = new GalleryDAOImpl();
            ArrayList<Gallery> top3Galleries = galleryDAO.getTop3Galleries();
            request.setAttribute("Top3Gallery", top3Galleries);

            // get information
            IInfomationDAO infomationDAO = new InformationDAOImpl();
            request.setAttribute("information", infomationDAO.getInfor());

            // get link share
            IShareDAO shareDAO = new ShareDAOImpl();
            ArrayList<Share> shareList = shareDAO.getShare();
            request.setAttribute("ShareList", shareList);

            request.setAttribute("boldContact", "font-bold");
            request.getRequestDispatcher("contact.jsp").forward(request, response);
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
