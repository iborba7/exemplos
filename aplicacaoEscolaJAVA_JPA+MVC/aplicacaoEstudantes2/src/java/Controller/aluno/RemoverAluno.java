/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.aluno;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.Aluno.AlunoDAO;
import MODEL.Aluno.Aluno;
import javax.servlet.RequestDispatcher;
/**
 *
 * @author Compaq
 */
@WebServlet(value="/RemoverAluno")
public class RemoverAluno extends HttpServlet {
    int id;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         try {
            id = Integer.parseInt(request.getParameter("id"));
            AlunoDAO dao = new AlunoDAO();
             dao.connect();
             dao.deletaAluno(id);
             dao.disconnect();
             
             RequestDispatcher dispatcher = request.getRequestDispatcher("ListaAluno");
            dispatcher.forward(request, response);
             
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
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

