
<%@page import="MODEL.Aluno.Aluno, java.util.List, java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Frequência</title>
    </head>
    <body>
        <h1>Registro de Frequência</h1>
        <form id="formFrequencia" action="registrarFrequenciaid=$" method="GET">
        <table border="1" cellspacing="0" cellpadding="4">
        <tr><th>Nome</th><th>CPF</th><th>Matricula</th><th>Presente</th><th>Falta</th></tr>
        <c:forEach var="a" items="${cadastro}">
            <tr>
                <td>${a.nome}</td>
                <td>${a.cpf}</td>
                <td>${a.matricula}</td>
                <td>
                    <input type="checkbox" name="presente" value="${a.id}">Presente<br>
                </td>                
                <td>
                    <input type="checkbox" name="falta" value="${a.id}">Falta<br>
                </td>                    
            </tr>
        </c:forEach> 
        </table>
            <input type="date" name="data">
            <input type="submit" onclick="" id="submit" name="Enviar"/>
        </form>    
        
        <br/><a href="EncaminhaCadastrarAluno">Cadastrar Aluno</a><br/>
        <br/><a href="gerenciarAlunos">Menu</a>
    </body>
</html>
