<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
			<table class="table table-responsive" summary="Tabela de clientes cadastrados no sistema">
  				<caption>Clientes cadastrados no sistema</caption>
  				<tbody>
    				<tr>
      					<th scope="col">Nome</th>
            	       	<th scope="col">C�digo</th>
      					<th scope="col">Contato</th>
      					<th scope="col">E-mail</th>
      					<th scope="col">Respons�vel</th>
            	       	<th scope="col">Opera��es</th>
    				</tr>
            	   	<c:forEach var="cliente" items="${listaClientes}">
            	   		<tr>
            	   			<td>${cliente.nome}</td>
            	  			<td>${cliente.fmtCodigo}</td>
            	   			<td>${cliente.fmtContato}</td>
            	   			<td><a href="enviarEmail?email='${cliente.email}'">${cliente.email}</a></td>
            	   			<td>${cliente.responsavel}</td>
            	   			<td>
            	   				<a href="visualizarRegistros?id=${cliente.id}">Visualizar registros</a>
            	   				<br>
            	   				<a href="atualizarCliente?id=${cliente.id}">Atualizar</a>
            	   				<br>
            	   				<a href="removerCliente?id=${cliente.id}">Remover</a>
            	   			</td>
            	   		</tr>
            	   	</c:forEach>
               </tbody>
            </table>