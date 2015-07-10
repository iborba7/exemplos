function testa_form()
{
	var n = document.forms["formalunos"]["nome_aluno"].value;
	var m = document.forms["formalunos"]["matricula"].value;
	
	if (m==null || m=="")
	{
		alert("Número de matrícula precisa ser informado.");
		return false;
	}
	
	if (n==null || n=="")
	{
		alert("Nome do aluno precisa ser informado.");
		return false;
	}
	
}