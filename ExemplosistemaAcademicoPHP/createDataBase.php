<?php



$conexao = mysql_connect("localhost","root", "");

if(!$conexao)
{
	die('N�o foi poss�vel estabeleceer conex�o com bancode dados. Erro detectado: '.mysql_error());
}

echo 'Conex�o bem-sucedida.';

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