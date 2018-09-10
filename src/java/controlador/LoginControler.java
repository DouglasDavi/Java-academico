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
import model.Usuario;

/**
 *
 * @author alunoces
 */
@WebServlet(name = "LoginControler", urlPatterns = {"/LoginControler"})
public class LoginControler extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        HttpSession session = req.getSession(true);
    
        String login = req.getParameter("login");
        String senha = req.getParameter("senha");
        
        String controle = "/Login.jsp";
        
        if(login.equals("admin") && senha.equals("admin")){
            
        Usuario usuario = new Usuario(login, senha);
        session.setAttribute("usuario", usuario);
        
        controle = "/index.jsp";
        
        }else{
            req.setAttribute("erro", "Usuário ou senha desconhecido.");
            /*RequestDispatcher rd = req.getRequestDispatcher("LoginErro.java");
            rd.forward(req, resp);*/
        }
            
            
        RequestDispatcher rd = req.getRequestDispatcher(controle);
        rd.forward(req,resp);
    
    
    
    }

    
        
  


    
}
