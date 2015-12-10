/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.usuario;

import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.Usuario.UsuarioDAO;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import MODEL.Usuario.Usuario;
/**
 *
 * @author Compaq
 */
@WebServlet(value="/loginController")
public class loginController extends HttpServlet {

         
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
         UsuarioDAO dao = new UsuarioDAO();
         Usuario usuario = new Usuario();
         String login;
         String senha;
         
        login = request.getParameter("login");
        senha = request.getParameter("senha");
        
        usuario = dao.getUser(login, senha);
        
        if(usuario == null ){
        

        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewUsuario/cadastro.html");
        dispatcher.forward(request, response);
            
        }
        
        HttpSession session = request.getSession(true);
        
        session.setMaxInactiveInterval(300);
        session.setAttribute("loginUser", usuario);
          RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAluno/gerenciarAlunos.jsp");
          dispatcher.forward(request, response);
        
        if (session == null) {
            session.invalidate();
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