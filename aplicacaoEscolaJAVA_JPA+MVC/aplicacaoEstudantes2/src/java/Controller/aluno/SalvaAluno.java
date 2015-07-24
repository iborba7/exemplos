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
import DAO.Aluno.AlunoDAO;
import MODEL.Aluno.Aluno;
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
    String cpf;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        nome = request.getParameter("nome");
        matricula = request.getParameter("matricula");
        cpf = request.getParameter("cpf");
       
        AlunoDAO dao = new AlunoDAO();
        dao.connect();
        Aluno aluno = new Aluno();
        aluno = dao.getAlunoByCpf(cpf);
        
        if(aluno != null){
                dao.disconnect();
                RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAluno/alunoExistente.html");
                dispatcher.forward(request, response);
        }
        
        aluno = new Aluno(nome, matricula, cpf);
            
            dao.insereAluno(aluno);
            dao.disconnect();
            RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAluno/gerenciarAlunos.jsp");
            dispatcher.forward(request, response);
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
