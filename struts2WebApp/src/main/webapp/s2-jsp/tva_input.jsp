<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>tva_input</title>
</head>
<body>
  <h2><s:text name="vat.input.title" />
      <!-- <s:property value="%{getText('vat.input.title')}"/> -->
    </h2>
  
  <div id="formulaire">
		<s:form method ="post" action="calculer_tva">
		
			<s:textfield name="stHt" id="ht"
				label="%{getText('vat.form.eot')}" labelposition="left">
			</s:textfield>
			
			<s:textfield name="stTaux" id="taux"
				label="%{getText('vat.form.rate')}" labelposition="left">
			</s:textfield>	
					
			<s:submit value = "%{getText('vat.form.submit.value')}"></s:submit>
		</s:form>
	</div>
</body>
</html>