<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Cadastre sua receita!</title>
	</head>
	<body>
		<!-- na parte dos alimentos precisa de um sistema de seleção dos alimentos que estejam na tabela e mostre os alimentos adicionados dinamicamente -->
		<!-- Precisaria criar uma especie de carrinho de compras para cada refeição que seria preenchido com os alimentos, por enquanto só está recebendo um alimento-->
		<g:form controller="telaCadastro" action="cadastrarReceita">
			<b>Nome da receita </b><g:textField class="inputField" name="nomeReceita"/><br/>
			<b>Descrição: </b><g:textArea class="inputField" name="descricaoReceita" value="Sua descrição" row="5" cols="40"/><br/>
			<b>Tipo de receita </b> 
			<select>
				<option value="padrao">Padrao</option>
				<option value="geral">Geral</option>
			</select> <br/>
			<b>Alimento para café da manhã </b><g:textField class="inputField" name="alimentoCafe" value="Nome do alimento"/><br/>
			<b>Alimento para lanche da manhã </b><g:textField class="inputField" name="lancheManha" value="Nome do alimento"/><br/> 
			<b>Alimento para almoço </b><g:textField class="inputField" name="alimentoAlmoco" value="Nome do alimento"/><br/> 
			<b>Alimento para lanche da tarde </b><g:textField class="inputField" name="lancheTarde" value="Nome do alimento"/><br/> 
			<b>Alimento para jantar </b><g:textField class="inputField" name="jantar" value="Nome do alimento"/><br/>
			<input type="submit" value="Cadastrar"/>
		</g:form>
	</body>
</html>