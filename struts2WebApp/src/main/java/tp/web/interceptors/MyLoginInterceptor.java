package tp.web.interceptors;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyLoginInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
        System.out.println("dans MyLoginInterceptor.intercept() ...");
		
		Map<String, Object> session = invocation.getInvocationContext().getSession();
		
		if(session.get("userId")==null)
		{
			//si pas de "userId" en session http renvoyer une chaine "result" pour
			//demander à rediriger vers une action définie dans struts.xml pour 
			//forcer à passer préalablement par "saisir_inscription" ou "login" 
			return "redirect_to_saisir_inscription"; //ou "redirect_login"  ou ...;
		}else{
			return invocation.invoke();
			}
	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("fin de MyLoginInterceptor");
	}

	@Override
	public void init() {
		super.init();
		System.out.println("initialisation de MyLoginInterceptor");
	}
	
	

}

/*
 utilisation dans struts.xml
 ===========================
 
 
<package name="tp.web.actions"  namespace="/s2" extends="struts-default">
   
        <interceptors>
			<interceptor name="myLoginInterceptor" 
						 class="tp.web.interceptors.MyLoginInterceptor">
			</interceptor>
		</interceptors>
	
	....
	
	<action name="ListeProduitsForCaddy" method="loadListeProduits" class="tp.web.actions.CaddyAction">
		      <interceptor-ref name="defaultStack"/> <!-- liste d'intercepteurs par defaut -->
	  		  <interceptor-ref name="myLoginInterceptor"/>
			<result name="success">/s2-jsp/add_in_caddy.jsp</result>
			<result name="redirect_to_saisir_inscription" type="redirect">saisir_inscription</result>
		</action>
		
		...
		<action name="saisir_inscription" >
       		<result>/s2-jsp/inscription.jsp</result>
        </action>
    ...

 
 
 
 */


