<?php



$conexao = mysql_connect("localhost","root", "");

if(!$conexao)
{
	die('Não foi possível estabeleceer conexão com bancode dados. Erro detectado: '.mysql_error());
}

echo 'Conexão bem-sucedida.';
mysql_set_charset('utf8', $conexao);

mysql_close($conexao);





?>