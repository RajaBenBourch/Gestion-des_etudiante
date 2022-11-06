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
<h1> Supprimer d'un étudiant</h1>
<form action="supprimerEtudiantExec" method="get">
  <button type="submit" class="btn btn-danger mb-2">supprimer</button>
  <%
  HttpSession Session = request.getSession();
  Session.setAttribute("id", request.getParameter("id"));  		
  %>
</form>
</body>
</html>