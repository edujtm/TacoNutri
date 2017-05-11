<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Login - TacoNutri</title>
	</head>
	<body>
		<g:form controller="Login" action="autenticarUsuario">
			<g:textField name="nomeUsuario"/> <br/>
			<g:passwordField name="senhaUsuario"/> <br/>
			<input type="submit" value="Entrar"/>
		</g:form>
	</body>
</html>