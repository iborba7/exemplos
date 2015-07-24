<%@page import="MODEL.Aluno.Aluno, java.util.List, java.util.ArrayList"%>
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
        <tr><th>Nome</th><th>CPF</th><th>Matricula</th></tr>
        <c:forEach var="a" items="${cadastro}">
            <tr>
                <td>${a.nome}</td>
                <td>${a.cpf}</td>
                <td>${a.matricula}</td>
                <td>
                    <a href="EncaminhaListaAlunos?id=${a.id}">Alterar</a>
                    &nbsp;&nbsp;&nbsp;
                    <a href="RemoverAluno?id=${a.id}">Remover</a>
                </td>                
                    
                
            </tr>
        </c:forEach>
        </table>
        
        <br/><a href="EncaminhaCadastrarAluno">Cadastrar Aluno</a><br/>
        <br/><a href="gerenciarAlunos">Menu</a>
    </body>
</html>
