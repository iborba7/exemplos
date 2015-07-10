function justifica_falta(form)
{
	var jf = confirm("justifica falta" + form.nome_aluno.value+" ?");
	
	if(jf == true)
	{
		var texto_jf = prompt("Digite a Justificativa apresentada");
	}
	else 
	{
		alert("falta não justificada");
	}
}