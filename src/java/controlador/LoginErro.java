/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author alunoces
 */
@WebServlet(name = "LoginErro", urlPatterns = {"/LoginErro"})
public class LoginErro extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
       
    
    HttpSession session = req.getSession(true);
    if(session.getAttribute("login") == null) {
            req.setAttribute("erro", "Favor realize login para continuar");
            RequestDispatcher rd = req.getRequestDispatcher("/Login.jsp");
            rd.forward(req, resp);
    
    }
    RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
    rd.forward(req, resp);
        
}
}