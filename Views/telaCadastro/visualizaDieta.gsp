<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Suas receitas</title>
	</head>
	<body>
	    <div id="list-food" class="content scaffold-list" role="main">
	        <h1>Suas receitas</h1>
	        <g:if test="${flash.message}">
	        	<div class="message" role="status">${flash.message}</div>
	        </g:if>	
	        <table>
	            <thead>
	                <tr>
	                    <g:sortableColumn property="nome" title="Nome da receita" />
	                    <g:sortableColumn property="tipo" title="Tipo" />
	                    <!-- Teria uma coluna para o nome do paciente -->
	                </tr>
	            </thead>
	            <tbody>
		            <g:each in="${recipesList}" status="i" var="recipeInstance">
		                <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
		                    <td><g:link action="show" id="${recipeInstance.id}">${fieldValue(bean: recipeInstance, field: "nome")}</g:link></td>
		                    <td>${fieldValue(bean: recipeInstance, field: "tipo")}</td>
		                </tr>
	            	</g:each>
	            </tbody>
	        </table>
	        <div class="pagination">
	            <g:paginate total="${recipeTotal}" />
	        </div>
        </div>
	</body>
</html>
