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
<h1>Ajouter d'un �tudiant</h1>
<form action="ajouterEtudiantExec" method="get">
  <div class="form-group row">
    <label for="nom" class="col-sm-2 col-form-label">Nom</label>
    <div class="col-sm-6">
      <input type="text" name="nom"  class="form-control" id="nom" placeholder="Nom">
    </div>
  </div>
  <div class="form-group row">
    <label for="prenom" class="col-sm-2 col-form-label">Pr�nom</label>
    <div class="col-sm-6">
      <input type="text" name="prenom" class="form-control" id="prenom" placeholder="Pr�nom">
    </div>
  </div>
  <div class="form-group row">
    <label for="note" class="col-sm-2 col-form-label">Note</label>
    <div class="col-sm-6">
      <input type="text" name="note" class="form-control" id="note" placeholder="Note">
    </div>
  </div>
  <button type="submit" class="btn btn-danger mb-2">Cr�er</button>
</form>
</body>
</html>