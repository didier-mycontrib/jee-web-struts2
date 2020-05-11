<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>caddy content (in session)</title>
</head>
<body>
  <h2>caddy content (in session)</h2>


	<div class="content">
	<table class="userTable" border="1" cellpadding="5px">
		<tr class="even">
			<th>numProduit</th>
			<th>quantite</th>
			<th>...</th>
		</tr>
		<s:iterator value="listeSelection" status="selectionStatus">
			<tr class="<s:if test="#selectionStatus.odd == true ">odd</s:if> <s:else>even</s:else>">
				<td><s:property value="numProduit" /></td>
				<td><s:property value="quantite" /></td>
				<td>...</td>
			</tr>
		</s:iterator>
	</table>
	</div>
 <hr/>
	<s:url id="welcome_url" action="welcome"></s:url>
    <s:a href="%{welcome_url}" >retour vers welcome</s:a><br/>
</body>
</html>