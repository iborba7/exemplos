/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.usuario;

import Excecoes.DadosInvalidosException;
import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import MODEL.Usuario.Usuario;
import DAO.Usuario.UsuarioDAO;

/**
 *
 * @author Compaq
 */
@WebServlet(value="/SalvaUsuario")
public class SalvaUsuario extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome;
        String senha;
        String senhaConf;
        String login;
        String cpf;
        
        
        try{
        nome = request.getParameter("nome");
        login = request.getParameter("login");
        senha = request.getParameter("senha");
        cpf = request.getParameter("cpf");
        
       
        } catch (Exception e){
            
            throw new DadosInvalidosException();
        }
        
        UsuarioDAO dao = new UsuarioDAO();
        Usuario user = dao.getUserByCpf(cpf);
        
        if(user == null){
        
            user = new Usuario(nome, senha, cpf, login);
            dao.insereUsuario(user);
            
             RequestDispatcher dispatcher = request.getRequestDispatcher("ViewUsuario/login.html");
            dispatcher.forward(request, response);
        } else {
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("ViewUsuario/usuarioExistente.html");
            dispatcher.forward(request, response);
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
