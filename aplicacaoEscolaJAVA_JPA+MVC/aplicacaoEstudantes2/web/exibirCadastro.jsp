<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="MODEL.Aluno, java.util.List, java.util.ArrayList"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exibir Alunos cadastrados</title>
    </head>
    <body>
        <h1>Exibir Cadastro</h1>
        
        <table border="1" cellspacing="0" cellpadding="4">
        <tr><th>Código</th><th>Nome</th><th>&nbsp;</th></tr>
        <c:forEach var="a" items="${cadastro}">
            <tr>
                <td>${a.nome}</td>
                <td>${a.cpf}</td>
                <td>${a.matricula}</td>
                <td>
                    
                </td>
            </tr>
        </c:forEach>
        </table>
        
        <br/><a href="cadastrarAluno.html">Cadastrar Aluno</a><br/>
        <br/><a href="gerenciarAlunos.jsp">Menu</a>
    </body>
</html>
