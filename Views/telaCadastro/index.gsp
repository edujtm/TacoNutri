<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>	
		<title>TacoNutri</title>
	</head>
	<body>
		<h1>TacoNutri</h1>
		<p>Bem vindo ao TacoNutri, um sistema feito para facilitar sua comunicação com seu nutricionista e te manter informado sobre sua dieta para que você não se desmotive e esteja sempre saudável.</p>
		<!--Adicionar descrição sobre a tabela TACO depois -->
		<!-- Codigo necessário para dar suporte a multiplas funcionalidades para cada tipo de usuário
			Não está funcionando por enquanto 
		<div id="Funcionalidades">
			<g:each in="${nomes}" var="nome" status="i">
				<div class="function"><a href='${links[i]}'>${nome}</a></div>
			</g:each>
		</div>
		-->

		
		<div id="Funcionalidades">
			<div class="funcao">
				<a href="/Alimento/list">Visualizar alimentos </a>
			</div>
			<div class="funcao">
				<a href="/Alimento/upload">Cadastrar alimentos</a>
			</div>
			<div class="funcao">
				<a href="/TelaCadastro/visualizaDieta">Visualizar Dietas </a>
			</div>
			<div class="funcao">
				<a href="/TelaCadastro/cadastroDieta">Cadastrar Dietas</a>
			</div>
		</div> 
	</body>
</html>