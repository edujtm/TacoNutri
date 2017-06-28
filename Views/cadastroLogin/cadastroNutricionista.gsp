<!DOCTYPE html>
<html>
	<head>
		<title>Cadastro de Nutricionista</title>
		<link href="https://fonts.googleapis.com/css?family=Catamaran:100|Pontano+Sans|Ruda:900" rel="stylesheet"/>
		<asset:stylesheet src="estiloTopToolbarLoggedOut.css"/>
		<asset:stylesheet src="estiloCadastroUsuario.css"/>
	</head>
	<body>
		<!-- TODO colocar topo da página e texto de boas vindas -->
		<g:render template="/layouts/topo_toolbar"/>
		<div id="background">
			<div id="formCadastroU">
				<div id="formContent">
					<g:form controller="CadastroLogin" action="cadastrarNutricionista">
						<span class="label"><b>Nome do Nutricionista </b></span> <g:textField class="inputField" name="nomeNutricionista"/> <br/>
						<span class="label"><b>Login </b></span> <g:textField class="inputField" name="nomeLogin"/> <br/>
						<span class="label"><b>Senha </b></span> <g:passwordField class="inputField" name="senhaLogin"/> <br/>
						<span class="label"><b>Local da CRN </b></span> <g:textField class="inputField" name="localCrn"/> <br/>
						<span class="label"><b>CPF </b></span> <g:textField class="inputField" name="cpf"/> <br/>
						<span class="label"><b>RG </b></span> <g:textField class="inputField" name="rg"/> <br/>
						<input class="btn" type="submit" value="Cadastrar"/>
					</g:form>
				</div>
			</div>
		</div>
	</body>
</html>
