<?php

$mod = $_POST['curso'];

switch ($mod) {

case 'm' :
echo 'Manutenção de Computadores: Manhã e noite';
break;

case 'r' :
echo 'Curso de redes de Computadores';
break;

case 'p' :
echo 'Curso de Programação de Computadores';
break;

case 'w':
echo 'Curso de Programação Web';
break;

default:
echo 'Preencha o Formulário novamente ';
break;


}
?>