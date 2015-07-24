<%@page import="MODEL.Aluno.Aluno, java.util.List, java.util.ArrayList"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exibir Alunos cadastrados</title>
    </head>
    <body>
        <h1>Alterar cadastro de Aluno</h1>
        
        <div><form id="form2" action="AlterarAluno?id=${aluno.id}" method="POST">
        
            
                <p>Alterar o nome? ${aluno.nome}</p>
                <input type="text" name="nome" id="nome" size="20"/><br/>
                <p>Alterar o cpf? ${aluno.cpf}</p>
                <input type="text" name="cpf" id="cpf" size="20" /><br/>
                <p>Alterar o número de Matrícula? ${aluno.matricula}</p>
                <input type="text" name="matricula" id="matricula" size="20"><br/>
                
                
        
        <input type="submit" id="submit" name="Enviar"/>
       </form></div>
    </body>
</html>
