/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.aluno;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.AlunoDAO;
import MODEL.Aluno;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
/**
 *
 * @author Compaq
 */
@WebServlet (value = "/SalvaAluno")
public class SalvaAluno extends HttpServlet {
    
    String nome;
    String matricula;
    int cpf;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        nome = request.getParameter("nome");
        matricula = request.getParameter("matricula");
        cpf = Integer.parseInt(request.getParameter("cpf"));
       
        
        AlunoDAO dao = new AlunoDAO();
        Aluno aluno = dao.buscaAluno(cpf);
        
        if(aluno == null){
        
            dao.insereAluno(aluno);
            RequestDispatcher dispatcher = request.getRequestDispatcher("gerenciarAlunos.jsp");
                dispatcher.forward(request, response);
            
        }
        else{
            
                RequestDispatcher dispatcher = request.getRequestDispatcher("/alunoExistente");
                dispatcher.forward(request, response);
    }
                
                
              
        
         
        
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
