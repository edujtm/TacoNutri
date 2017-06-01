<%@ page import="edu.ufrn.pdsoft.model.Alimento" %>
<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main">
        <title>Food List</title>
    </head>
    <body>
        <div class="nav" role="navigation">
            <ul>
                <li><g:link class="create" action="upload">Upload Data</g:link></li>
            </ul>
        </div>
        <div id="list-food" class="content scaffold-list" role="main">
            <h1>Food List</h1>
            <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
            </g:if>
            <table>
                <thead>
                    <tr>
                        <g:sortableColumn property="nome" title="Food name" />
                        <g:sortableColumn property="calorias" title="Calories" />
                        <g:sortableColumn property="proteinas" title="Proteins" />
                        <g:sortableColumn property="calcio" title="Calcium" />
                    </tr>
                </thead>
                <tbody>
                <g:each in="${foodInstanceList}" status="i" var="foodInstance">
                    <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
                        <td><g:link action="show" id="${foodInstance.id}">${fieldValue(bean: foodInstance, field: "nome")}</g:link></td>
                        <td>${fieldValue(bean: foodInstance, field: "calorias")}</td>
                        <td>${fieldValue(bean: foodInstance, field: "proteinas")}</td>
                        <td>${fieldValue(bean: foodInstance, field: "calcio")}</td>
                    </tr>
                </g:each>
                </tbody>
            </table>
            <div class="pagination">
                <g:paginate total="${foodInstanceTotal}" />
            </div>
        </div>
    </body>
</html>