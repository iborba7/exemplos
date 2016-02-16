#!/bin/bash
#
#

show_menus() {
	clear
	echo "~~~~~~~~~~~~~~~~~~~~~"	
	echo "M E N U - Principal "
	echo "~~~~~~~~~~~~~~~~~~~~~"
	echo "1. Postar no Twitter"
	echo "2. Seguir alguém no Twitter"
	echo "3. Mostrar os últimos 10 tweets em que você foi mencionado"
	echo "4. Buscar Tweets contendo uma keyWord da sua Timeline"
	echo "5. Sair"
} 

read_options(){
	local choice
	read -p "Entre com uma opção [ 1 - 5] " choice
	case $choice in
		1) update_status_on_twitter ;;
		2) follow ;;
		3) show_last_mentions ;;
		4) search_some_shit ;; 
		5) exit 0;;
		*) echo -e "${RED}Erro...${STD}" && sleep 2
	esac
}

update_status_on_twitter() {

echo "Digite uma mensagem de atualização de Status: " ; read updateMessage

if [ $updateMessage -z ]

then
echo "Por favor digite uma mensagem!"; read updateMessage
fi

updateStatus= t update "$updateMessage" 

echo $updateStatus

}

follow(){

echo "Digite um ou mais usuários para seguir no Twitter (Ex. Digite no padrao @usuario1 @usuario2): " ; read user

#while [ grep -q @  <<<$user ] 
while [[ $user != "@"*  ]]
do   

echo "Simbolo @ não digitado! Tente novamente"

echo "Digite um ou mais usuários para seguir no Twitter (Ex. Digite no padrao @usuario1 @usuario2): " ; read user

done

echo "Caractere @ digitado"
followSomeOne= t follow $user
echo $followSomeOne

}

show_last_mentions(){

mentions= t mentions -n 10 
echo $mentions

if [ $mentions -z  ]
then

echo "Desculpa mas você não é popular hahaha"

exit
fi
}

search_some_shit(){

echo "Digite um termo para buscar na sua Timeline: " ; read someShit
searchSomeShit= t search timeline $someShit

echo $searchSomeShit  

}


show_menus
read_options
