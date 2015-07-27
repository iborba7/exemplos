<?php



$conexao = mysql_connect("localhost","root", "");

if(!$conexao)
{
	die('Não foi possível estabeleceer conexão com bancode dados. Erro detectado: '.mysql_error());
}

echo 'Conexão bem-sucedida.';

$banco= "CREATE DATABASE sis_academico";

if (mysql_query($banco, $conexao))
{
	echo "O banco de dados foi criado com sucesso \n";
}

else 
{
	echo 'Erro ao criar o banco de dados:' . mysql_error();
}

mysql_close($conexao);

?>