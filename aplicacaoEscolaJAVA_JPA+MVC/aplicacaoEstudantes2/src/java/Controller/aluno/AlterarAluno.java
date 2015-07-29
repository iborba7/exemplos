/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.aluno;

import DAO.Aluno.AlunoDAO;
import MODEL.Aluno.Aluno;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Compaq
 */
@WebServlet(name = "AlterarAluno", urlPatterns = {"/AlterarAluno"})
public class AlterarAluno extends HttpServlet {

    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String nome;
            String cpf;
            String matricula;
            int id;
            boolean update;
            
            nome = request.getParameter("nome");
            cpf = request.getParameter("cpf");
            matricula = request.getParameter("matricula");
            id = Integer.parseInt(request.getParameter("id"));
            boolean checkCpf;
               
           AlunoDAO dao = new AlunoDAO();
           
           try{
           dao.connect();
           }catch(Exception e){
               
               e.printStackTrace();
           }
           dao.updateAlunoNome(id, nome);     
           
           checkCpf = dao.updateAlunoCpf(id, cpf);
           
           if(checkCpf == false){
           
                dao.disconnect();
                RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAluno/alunoExistente.html");
                dispatcher.forward(request, response);
               
           }
           dao.updateAlunoMatricula(id, matricula);
           dao.disconnect();     
            
            Aluno aluno = new Aluno(nome, matricula, cpf);
                   
        if(aluno != null){
               RequestDispatcher dispatcher = request.getRequestDispatcher("ListaAluno");
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
