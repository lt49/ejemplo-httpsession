/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.Timer;

/**
 *
 * @author Luis alberto
 */
public class CerrarSessionServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    public void Cerrar(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            Thread.sleep(5000);
            HttpSession session = request.getSession();
        session.removeAttribute("usuario");
        request.getRequestDispatcher("index.jsp").forward(request, response);  
        } catch (InterruptedException e) {
           
        }
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int delay = 10000; //milliseconds
        
       
          
        ActionListener taskPerformer = new ActionListener() {
          
            public void actionPerformed(ActionEvent e) {
                                
                System.out.println("Hola2");
                                
                
                
            }
                        
        };
        
        new Timer(delay, taskPerformer).start();
        System.out.println("Hola");              
//        TimerTask timerTask;
//        timerTask = new TimerTask() {
//            
//            @Override
//            public void run() {
//                
//                System.out.println("Hola");
//                HttpSession session = request.getSession();
//                //session.removeAttribute("usuario");
//                try {
//                    request.getRequestDispatcher("index.jsp").forward(request, response);
//                } catch (ServletException | IOException ex) {
//                    Logger.getLogger(CerrarSessionServlet.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                
//            }
//        };
//    
//        Timer timer = new Timer();
//        timer.scheduleAtFixedRate(timerTask, 10000, 10000);//timer.scheduleAtFixedRate(timerTask, tiempo para que empiese a ejecutar por primera vez, tiempo para que se ejecute cada tiempo);
        
       
        
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
