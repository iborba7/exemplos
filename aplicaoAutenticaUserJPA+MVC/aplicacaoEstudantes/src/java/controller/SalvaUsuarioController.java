/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import excecoes.DadosInvalidosException;
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
import model.Usuario;

/**
 *
 * @author Compaq
 */
@WebServlet(value="/SalvarUsuarioController")
public class SalvaUsuarioController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome;
        String senha;
        String senhaConf;
        String login;
        int cpf;
        String sql;
        
        try{
        nome = request.getParameter("nome");
        login = request.getParameter("login");
        senha = request.getParameter("senha");
        cpf = Integer.parseInt(request.getParameter("cpf"));
        
       
        } catch (Exception e){
            
            throw new DadosInvalidosException();
        }
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aplicacaoEstudantesPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Usuario user = em.find(Usuario.class, cpf);
        
        if(user == null){
        
            user = new Usuario(nome, senha, cpf, login);
            em.persist(user);
        } else {
            
            user.setNome(nome);
            user.setSenha(senha);
        }
        
        em.getTransaction().commit();
        em.close();
        emf.close();
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/login.html");
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
