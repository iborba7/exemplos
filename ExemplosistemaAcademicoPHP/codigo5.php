<?php

$mod = $_POST['curso'];

switch ($mod) {

case 'm' :
echo 'Manuten��o de Computadores: Manh� e noite';
break;

case 'r' :
echo 'Curso de redes de Computadores';
break;

case 'p' :
echo 'Curso de Programa��o de Computadores';
break;

case 'w':
echo 'Curso de Programa��o Web';
break;

default:
echo 'Preencha o Formul�rio novamente ';
break;


}
?>