
function calc_media(n1,n2)
{
	var m = (n1+n2)/2;
	return m;
}

function resultado(form)
{
	var media = calc_media(parseFloat(form.nota1.value), parseFloat(form.nota2.value));
	
	if(media >= 7)
		alert("aprovado");
		
	else
	alert("recuperação");

}

function funcao1(mensagem)
{
	alert(mensagem);
}