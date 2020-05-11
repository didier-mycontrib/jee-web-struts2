<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">@import url(../css/styles.css);</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>inscription (avec validation)</title>
<!-- <s:head/> -->
</head>
<body>
  <h2>inscription (avec validation)</h2>
  
  <div id="formulaire">
        <s:actionerror />
        <!-- 
        <s:if test="hasFieldErrors()">
    		<div class="errorMessage">
      			  <s:fielderror />
   			 </div>
		</s:if>
		-->
		<s:form method ="post" action="inscrire_utilisateur" validate="true">
		
		
			<s:textfield name="id" id="id"
				label="id" labelposition="left">
			</s:textfield>
			
			<s:textfield name="pseudo" id="pseudo"
				label="pseudo" labelposition="left">
			</s:textfield>
				
			<s:textfield name="age" id="age"
				label="age" labelposition="left">
			</s:textfield>	
			
			<s:textfield name="email" id="email"
				label="email" labelposition="left">
			</s:textfield>	
			
			<s:textfield name="numeroEtRue" id="numeroEtRue"
				label="numeroEtRue" labelposition="left">
			</s:textfield>
				
			<s:textfield name="codePostal" id="codePostal"
				label="codePostal" labelposition="left">
			</s:textfield>	
			
			<s:textfield name="ville" id="ville"
				label="ville" labelposition="left">
			</s:textfield>
			
			
			<s:textfield name="dateInscription" id="dateInscription"
				label="dateInscription" labelposition="left">
			</s:textfield>	
			
			<s:submit value = "inscrire"></s:submit>
		
		</s:form>
	</div>
</body>
</html>