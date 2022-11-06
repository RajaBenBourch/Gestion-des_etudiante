<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.gestioncloud.entities.Etudiant"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<h1> Modifier d'un étudiant</h1>
<% Etudiant e  = (Etudiant)request.getAttribute("etudiant"); %>
<form action="modifierEtudiantExec" method="get">
  <div class="form-group row">
    <label for="nom" class="col-sm-2 col-form-label">Nom</label>
    <div class="col-sm-6">
      <input type="text" name="nom" class="form-control" id="nom" placeholder="Nom" value = "<%=e.getNom()%>"/>
    </div>
  </div>
  <div class="form-group row">
    <label for="
" class="col-sm-2 col-form-label">Prénom</label>
    <div class="col-sm-6">
      <input type="text" name="prenom" class="form-control" id="prenom" placeholder="Prénom" value = "<%=e.getPrenom()%>"/>
    </div>
  </div>
  <div class="form-group row">
    <label for="note" class="col-sm-2 col-form-label">Note</label>
    <div class="col-sm-6">
      <input type="text" name="note" class="form-control" id="note" placeholder="Note" value = "<%=e.getNote()%>"/>
    </div>
  </div>
  <button type="submit" class="btn btn-danger mb-2">modifier</button>
  <%
  HttpSession Session = request.getSession();
  Session.setAttribute("id", request.getParameter("id"));  		
  %>
</form>
</body>
</html>