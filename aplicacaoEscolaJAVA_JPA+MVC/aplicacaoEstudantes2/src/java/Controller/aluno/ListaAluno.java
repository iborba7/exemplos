/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.aluno;

import java.io.IOException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.Aluno.AlunoDAO;

/**
 *
 * @author Compaq
 */
@WebServlet(name="ListaAlunos",urlPatterns={"/ListaAluno"})
public class ListaAluno extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            AlunoDAO dao = new AlunoDAO();
            
            request.setAttribute("cadastro", dao.listaAlunos());
            

             RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAluno/exibirCadastro.jsp");

        dispatcher.forward(request, response);
    
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            AlunoDAO dao = new AlunoDAO();
            
            request.setAttribute("cadastro", dao.listaAlunos());
            
             RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAluno/exibirCadastro.jsp");
        dispatcher.forward(request, response);
    }
    

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
