<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>add_in_caddy (session)</title>
</head>
<body>
  <h2>add_in_caddy (session)</h2>

<s:form action="addProdSelectionInCaddy">
	<s:push value="selection">
		<select name="numProduit" id="numProduit" >
             <s:iterator value="produitList"  status="prodStatus">
                                <option value='<s:property value="numero"/>'>
                                    [<s:property value="numero"/>]
                                    <s:property value="label"/> -
                                    <s:property value="prix"/> euro(s)
                                </option>
                            </s:iterator>
        </select>
		<s:select name="quantite" list="{1,2,3,4,5,6,7,8,9,10}" 
        	headerKey="" headerValue="Select" 
            label="Selectionner une quantité" />
		<s:submit value="submit (addInCaddy)" />
	</s:push>
</s:form>
<hr/>
nombre de selection(s) dans le caddy : <s:property value="listeSelection.size()" />
<hr/>
	<s:url id="listerContenuCaddy_url" action="listerContenuCaddy"></s:url>
    <s:a href="%{listerContenuCaddy_url}" >visualiser le contenu du caddy</s:a><br/>
</body>
</html>