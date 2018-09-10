/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
@WebServlet(name = "AdicionarControler", urlPatterns = {"/AdicionarControler"})
public class AdicionarControler extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  
        HttpSession session = req.getSession(true);
    
        
        String titulo = req.getParameter("titulo");
        String avalicao = req.getParameter("avaliacao");
        String usuario = req.getParameter("usuario");        
        int nota = Integer.parseInt(req.getParameter("nota"));
       
        Avaliacao avaliacao = new Avaliacao(titulo, usuario,avalicao, nota);
        
        
        List<Avaliacao> avalicoes = (List<Avaliacao>) session.getAttribute("avalicoes");
               
        
        if (avalicoes == null) {
            avalicoes = new ArrayList<>();
        }
        avalicoes.add(avaliacao);
        
        session.setAttribute("avalicoes", avalicoes);
        
        
        RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
        rd.forward(req,resp);     
        
        
       
        
        
        
       }
    
         

   
}
