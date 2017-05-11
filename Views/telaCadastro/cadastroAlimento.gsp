<!DOCTYPE html>
<html>
	<head>

		<meta name="layout" content="main"/>
		<title>Selecionar alimento</title>

	</head>
	<body>

		<g:form controller="TelaCadastroController" action="cadastrarAlimento">
			<b>Nome do alimento</b> <g:textField name="nomeAlimento"/> <br/>
			<b>Quantidade de calorias: </b> <g:textField name="qntCalorias"/> <br/>
			<b>Quantidade de proteinas: </b> <g:textField name="qntProteinas"/> <br/>
			<b>Quantidade de Calcio: </b> <g:textField name="qntCalcio"/> <br/>
			<input type="submit" value="Cadastrar"/>
		</g:form>
		
	</body>
</html>