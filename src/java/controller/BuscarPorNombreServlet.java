/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.dao.impl.HistoryDaoImpl;
import database.model.DBHistory;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Matias
 */
@WebServlet(name = "BuscarPorNombreServlet", urlPatterns = {"/buscarPorNombre.do"})
public class BuscarPorNombreServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String name = request.getParameter("nombre");

            if (!(name.equals(""))) {
                HistoryDaoImpl hdi = new HistoryDaoImpl();

                out.println("<table class= 'table is-bordered is-striped is-narrow is-hoverable is-fullwidth'>");
                out.println("<tr>");
                out.println("<th>Nombre</th>");
                out.println("<th>Rut</th>");
                out.println("<th>Fecha y hora de ingreso</th>");
                out.println("</tr>");
                out.println("<p class='select-css' id='nombre' name='txtNombre'> </p>");
                for (DBHistory d : hdi.getUserRecordByName(name)) {
                    out.println("<tr>");
                    out.println("<td>" + d.getUserName() + "</td>");
                    out.println("<td>" + d.getUserRut() + "</td>");
                    out.println("<td>" + d.getRegisterDate() + "</td>");
                    out.println("</tr>");
                }
                out.println("</table>");
            } else {
                out.println("<table class= 'table is-bordered is-striped is-narrow is-hoverable is-fullwidth'>");
                out.println("<tr>");
                out.println("<th>Nombre</th>");
                out.println("<th>Rut</th>");
                out.println("<th>Fecha y hora de ingreso</th>");
                out.println("</tr>");
                out.println("<p class='select-css' id='nombre' name='txtNombre'> </p>");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BuscarPorNombreServlet.class.getName()).log(Level.SEVERE, null, ex);
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
