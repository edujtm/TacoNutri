<!DOCTYPE html>
<html>
	<head>

		<meta name="layout" content="main"/>
		<title>Cadastro de nutricionista</title>

	</head>
	<body>

		<!--<g:form controller="TelaCadastro" action="cadastrarAlimento">-->
			<b>Nome do nutricionista: </b> <g:textField name="nomeNutricionista"/> <br/>
			<b>Login: </b> <g:textField name="nomeLogin"/> <br/>
			<b>Senha: </b> <g:passwordField name="senhaLogin"/> <br/>
			<b>Local da CRN: </b> <g:textField name="localCrn"/> <br/>
			<b>Numero da CRN: </b> <g:textField name="crn"/> <br/>
			<b>CPF: </b> <g:textField name="cpf"/> <br/>
			<b>RG: </b> <g:textField name="rg"/> <br/>
			<input type="submit" value="Cadastrar"/>
		</g:form>
		
	</body>
</html>