<!DOCTYPE html>
<html>
	<head>

		<meta name="layout" content="main"/>
		<title>Cadastro de usuário paciente</title>

	</head>
	<body>
		<!-- TODO colocar topo da página e texto de boas vindas -->
		<div id="formCadastroN">
			<g:form controller="CadastroLogin" action="cadastrarUsuario">
				<b>Nome do paciente: </b> <g:textField name="nomeCompleto"/> <br/>
				<b>Login: </b> <g:textField name="nomeLogin"/> <br/>
				<b>Senha: </b> <g:passwordField name="senhaLogin"/> <br/>
				<b>CPF: </b> <g:textField name="cpf"/> <br/>
				<b>RG: </b> <g:textField name="rg"/> <br/>
				<input type="submit" value="Cadastrar"/>
			</g:form>
		</div>
	</body>
</html>