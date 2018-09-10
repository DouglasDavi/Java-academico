/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Avaliacao;

/**
 *
 * @author alunoces
 */
@WebServlet(name = "AdicionarServlet", urlPatterns = {"/AdicionarServlet"})
public class AdicionarServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
        
        
        
        HttpSession session =  req.getSession(true);
        List<Avaliacao> avalicoes = (List<Avaliacao>) session.getAttribute("avalicoes");
        
        RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
        rd.forward(req, resp);
                
        
        
    }


      
        
  

    

}
