<!DOCTYPE html>
<html>
	<head>

		<meta name="layout" content="main"/>
		<title>Selecionar alimento</title>

	</head>
	<body>

		<g:form controller="TelaCadastro" action="buscarAlimento">
			<g:textField name="alimentoBusca"/>
			<input type="submit" value="Buscar"/>
		</g:form>

		<g:each in="${alimentos}" var="alimento" status="i" >
			<div id="divAlimento">
				<h2>${alimento.nome}</h2><br/>
				<b> Quantidade de calorias: </b> ${alimento.calorias} <br/>
				<b> Proteinas: </b> ${alimento.proteinas} <br/>
				<b> Calcio: </b> ${alimento.calcio} <br/>
				<!--Completar as informações dos alimentos aqui e na domain class --> 
			</div>
		</g:each>

	</body>
</html>