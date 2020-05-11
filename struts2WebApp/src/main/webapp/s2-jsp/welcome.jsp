<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>welcome</title>
</head>
<body>
  <h2>Welcome in struts2 web app</h2>
  <ul>
    <li> 
     <s:url id="saisir_tva_url_fr" action="saisir_tva">
     	<s:param name="request_locale">fr</s:param>
     </s:url>
     <s:url id="saisir_tva_url_en" action="saisir_tva">
     	<s:param name="request_locale">en</s:param>
     </s:url>
     <s:a href="%{saisir_tva_url_fr}" >tva (fr)</s:a> , <s:a href="%{saisir_tva_url_en}" >vat (en)</s:a>
   </li>
   <li> 
     <s:url id="listUser_url" action="listUser"></s:url>
     <s:a href="%{listUser_url}" >user list (crud)</s:a>
   </li>
   <li> 
     <s:url id="ListeProduitsForCaddy_url" action="ListeProduitsForCaddy"></s:url>
     <s:a href="%{ListeProduitsForCaddy_url}" >prod list (add in caddy / session)</s:a>
   </li>
   <li> 
     <s:url id="saisir_inscription_url" action="saisir_inscription"></s:url>
     <s:a href="%{saisir_inscription_url}" >inscription utilisateur (validation)</s:a>
   </li>
   <li>...</li>
  </ul>
</body>
</html>