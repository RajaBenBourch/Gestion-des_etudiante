<%@page import="com.gestioncloud.entities.Etudiant"%>
<%@page import="java.util.Collection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<h1>Liste des étudiants</h1>
<a href="ajouterEtudiantForm" class="btn btn-primary">Créer</a>
<br /> <br />
<%
	Collection<Etudiant> etudiants = (Collection<Etudiant>)request.getAttribute("etudiants");
%>

<table class="table table-striped">
	<tr>
		<th>Id</th>
		<th>Nom</th>
		<th>Prénom</th>
		<th>Note</th>
		<th></th>
	</tr>
<%
	for(Etudiant e : etudiants){
%>
	<tr>
		<td><%=e.getId() %></td>
		<td><%=e.getNom() %></td>
		<td><%=e.getPrenom() %></td>
		<td><%=e.getNote() %></td>
		<td>
			<a href="modifierEtudiantForm?id=<%=e.getId() %>" class="btn btn-success">Modifier</a>
			<a href="supprimerEtudiantForm?id=<%=e.getId() %>" class="btn btn-danger">Supprimer</a>
		</td>
	</tr>
<%
	}
%>
</table>


</body>
</html>