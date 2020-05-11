
<%@ taglib prefix ="s" uri="/struts-tags" %>

  <h2><s:text name="vat.input.title" />
      <!-- <s:property value="%{getText('vat.input.title')}"/> -->
    </h2>
  
  <div id="formulaire">
        <span class="errorMessage"><s:property value="message"/></span>
        <s:actionerror/>
        
        <s:property value="#request.annexe.numero" />
        <s:property value="#request.annexe.label" />
  
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
