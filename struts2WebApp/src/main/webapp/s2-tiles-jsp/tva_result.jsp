
<%@ taglib prefix ="s" uri="/struts-tags" %>

  <h2>tva (result)</h2>
  <div id="divTvaResult">
			ht: <s:property value="stHt" /> <br/>
			taux: <s:property value="stTaux" /> <br/>
			tva: <s:property value="tva" /> <br/>
			ttc: <s:property value="ttc" /> <br/>
	</div>
	<hr/>
	<s:url id="saisir_tva_url" action="saisir_tva"></s:url>
    <s:a href="%{saisir_tva_url}" >nouveau calcul tva</s:a><br/>
    <hr/>
	<s:url id="welcome_url" action="welcome"></s:url>
    <s:a href="%{welcome_url}" >retour vers welcome</s:a><br/>
