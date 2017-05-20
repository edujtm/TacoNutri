<!DOCTYPE html>
<html>
	<head>
		<title>Login - TacoNutri</title>
		<link href="${resource(dir: 'stylesheets', file: 'estiloLogin.css')}" type="text/css" rel="stylesheet"/>
		<link href="https://fonts.googleapis.com/css?family=Catamaran:100|Pontano+Sans|Ruda:900" rel="stylesheet"/>
	</head>
	<body>
		<div id="nav">
			<ul>
				<li><a href="/TelaInicial" >Inicio</a></li>
				<li><a href="#" >Planos</a></li>
				<li><a href="#" >Sobre nós</a></li>
			</ul>
		</div>
		<div class="outer">
			<div class="middle">
				<div id="formLogin">	
					<g:form controller="Login" action="autenticarUsuario">
						<!-- tentei por tudo centralizar isso -->
						<span class="label"> Login </span> <g:textField class="inputField" name="nomeUsuario"/> <br/>
						<span class="label">Senha</span> <g:passwordField class="inputField" name="senhaUsuario"/> <br/>
						<input class="btn" type="submit" value="Entrar"/>
					</g:form>
				</div>
			</div>
		</div>
	</body>
</html>