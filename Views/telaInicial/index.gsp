<!DOCTYPE html>
<html>
	<head>
		<title>TacoNutri</title>
		<link href="https://fonts.googleapis.com/css?family=Catamaran:100|Pontano+Sans|Ruda:900" rel="stylesheet"/>
		<asset:stylesheet src="estiloTopToolbarLoggedOut.css"/>
		<asset:stylesheet src="estiloTelaInicial.css"/>
	</head>
	<body>
		<g:render template="/layouts/topo_toolbar"/>
		<div id="firstRow">
			<div id="descricao"> 
				<p>
					Bem vindo ao TacoNutri, um sistema feito para facilitar sua comunicação com seu nutricionista e te manter informado sobre sua dieta para que você não se desmotive e esteja sempre saudável.
				</p>	
			</div>
			<!--Adicionar descrição sobre a tabela TACO depois -->
			<div id ="left-firstRow">
				<div id="login">
					<table>
						<tr><td><a href="/login">Sign in</a></td></tr>
						<tr><td><a href="/cadastroLogin/cadastroNutricionista">Sign up - Nutricionista</a></td></tr>
						<tr><td><a href="/cadastroLogin/cadastroUsuario">Sign up - Usuário</a></td></tr>
					</table>
				</div>
			</div>
		</div>
	</body>
</html>