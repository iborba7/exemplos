<?php



$conexao = mysql_connect("localhost","root", "");

if(!$conexao)
{
	die('N�o foi poss�vel estabeleceer conex�o com bancode dados. Erro detectado: '.mysql_error());
}

echo 'Conex�o bem-sucedida.';
mysql_set_charset('utf8', $conexao);

mysql_close($conexao);





?>