<%@ taglib prefix ="s" uri="/struts-tags" %>
<div style="background-color: #f4e69c">My Side Menu<br/>
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
</div>
