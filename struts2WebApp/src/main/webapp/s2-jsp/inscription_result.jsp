<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>resultat inscription</title>
</head>
<body>
  <h2>resultat inscription</h2>
  <div id="divInscriptionResult">
          
			id: <s:property value="id" /> <br/>
			pseudo: <s:property value="pseudo" /> <br/>
			age: <s:property value="age" /> <br/>
			email: <s:property value="email" /> <br/>
			numeroEtRue: <s:property value="numeroEtRue" /> <br/>
			codePostal: <s:property value="codePostal" /> <br/>
			ville: <s:property value="ville" /> <br/>
			dateInscription: <s:property value="dateInscription" /> <br/>
			
		
	</div>
	<hr/>
	<s:url id="saisir_inscription_url" action="saisir_inscription"></s:url>
     <s:a href="%{saisir_inscription_url}" >nouvelle inscription</s:a>
    <hr/>
	<s:url id="welcome_url" action="welcome"></s:url>
    <s:a href="%{welcome_url}" >retour vers welcome</s:a><br/>
</body>
</html>