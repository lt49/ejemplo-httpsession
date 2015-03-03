/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.EventListener;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Luis alberto
 */
public interface ActionListenerServlet extends EventListener{
    
    public void actionPerformed(ActionEvent e,HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException;
    
}
