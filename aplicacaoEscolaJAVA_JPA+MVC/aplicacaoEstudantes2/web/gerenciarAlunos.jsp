<%-- 
    Document   : gerenciarAlunos
    Created on : 12/07/2015, 14:05:51
    Author     : Compaq
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="MODEL.Usuario, java.util.List, java.util.ArrayList"%>
<%@page import="MODEL.Aluno, java.util.List, java.util.ArrayList"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gerenciar Alunos</title>
    </head>
    <body>
        <h1>
            <h2>Menu</h2>
            <ul>
                <li><a href="cadastrarAluno.html">Adicionar Alunos</a></li>
                <li><a href="ListaAluno">Listar Alunos</a></li> 
                <li><a href="removerAlunos">Remover Alunos</a></li>
                <li><a href="registrarFrequencia">Registrar Frequência</a></li>
            </ul>
        </h2>
        <footer>${pageContext.request.getAttribute(usuario)}</footer>
    </body>
</html>
