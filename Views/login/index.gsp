<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Login - TacoNutri</title>
	</head>
	<body>
		<g:form controller="Login" action="autenticarUsuario">
			<g:textField name="nomeUsuario"/>
			<g:passwordField name="senhaUsuario"/>
			<input type="submit" value="Entrar"/>
		</g:form>
	</body>
</html>