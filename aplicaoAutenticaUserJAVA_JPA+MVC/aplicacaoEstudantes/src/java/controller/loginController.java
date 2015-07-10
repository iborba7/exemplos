/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.usuarioDAO;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import model.Usuario;
/**
 *
 * @author Compaq
 */
public class loginController extends HttpServlet {

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        String login;
        String senha;
        
        login = request.getParameter("login");
        senha = request.getParameter("senha");
        
        usuarioDAO dao = new usuarioDAO();
        Usuario usuario = new Usuario();
        
        usuario = dao.getUser(login, senha);
        
        if(usuario == null ){
        
            
        RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro.html");
        dispatcher.forward(request, response);
            
        }
        
        HttpSession session = request.getSession();
        session.setMaxInactiveInterval(600);
        session.setAttribute("loginUser", usuario);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/bemVindo.html");
        dispatcher.forward(request, response);
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