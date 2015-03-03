/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Usuario;

/**
 *
 * @author Luis alberto
 */
public class ValidarServlet extends HttpServlet {

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
        
        String user = request.getParameter("txtUsuario"); user = (user == null)? "":user;
        String pass = request.getParameter("txtPassword"); pass = (pass == null)? "": pass;
        String name = "Luis Alberto Santa Maria Ticlavilca";
        
        /*
            lt49
            123456
        */
        
        
        if (user.equalsIgnoreCase("lt49") & pass.equalsIgnoreCase("123456")) {
            Usuario usu = new Usuario(user, pass, name);
            usu.setUsuario(user);
            usu.setPassword(pass);
            usu.setNombreCompleto(name);
            
            HttpSession session = request.getSession();
            session.setAttribute("usuario", usu);
            request.getRequestDispatcher("menu").forward(request, response);
        }else{
            request.getRequestDispatcher("error").forward(request, response);
        }
        
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
        
        String user = request.getParameter("txtUsuario"); user = (user == null)? "":user;
        String pass = request.getParameter("txtPassword"); pass = (pass == null)? "": pass;
        String name = "Luis Alberto Santa Maria Ticlavilca";
        
        /*
            lt49
            123456
        */
        
        
        if (user.equalsIgnoreCase("lt49") & pass.equalsIgnoreCase("123456")) {
            Usuario usu = new Usuario(user, pass, name);
            usu.setUsuario(user);
            usu.setPassword(pass);
            usu.setNombreCompleto(name);
            
            HttpSession session = request.getSession();
            session.setAttribute("usuario", usu);
            request.getRequestDispatcher("menu").forward(request, response);
        }else{
            request.getRequestDispatcher("error").forward(request, response);
        }
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
