<!DOCTYPE html>
<html>
	<head>
		<title>TacoNutri</title>
		<link href="${resource(dir: 'stylesheets', file: 'estiloTelaInicial.css')}" type="text/css" rel="stylesheet"/>
		<link href="https://fonts.googleapis.com/css?family=Catamaran:100|Pontano+Sans|Ruda:900" rel="stylesheet"/>
		<asset:stylesheet src="estiloTopToolbarLoggedOut.css"/>
	</head>
	<body>
		<g:render template="/layouts/topo_toolbar"/>
		<div id="descricao"> 
			<p>
				Bem vindo ao TacoNutri, um sistema feito para facilitar sua comunicação com seu nutricionista e te manter informado sobre sua dieta para que você não se desmotive e esteja sempre saudável.
			</p>
			<!--Adicionar descrição sobre a tabela TACO depois -->
			<div id="top_toolbar">
				<table>
					<tr>
						<td><a href="/login">Sign in</a></td>
						<td><a href="/cadastroNutri/cadastroNutricionista">Sign up - Nutricionista</a></td>
						<td><a href="/cadastroNutri/cadastroUsuario">Sign up - Usuário</a></td>
					</tr>
				</table>
			</div>
		</div>
	</body>
</html>