package tp.web.actions;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import tp.web.data.Utilisateur;

public class InscriptionAction extends ActionSupport 
    implements ModelDriven<Utilisateur>,SessionAware
{
	
	private static final long serialVersionUID = 1L;
	
	private Utilisateur utilisateur = new Utilisateur(); //a inscrire
	
	
	
	public String inscrire() {
		System.out.println("Dans la methode inscrire ...");
		 try {
			  System.out.println("Success... ");
			  sessionMap.put("userId", this.utilisateur.getId());//stokage en session http
			  return "success";
		} catch (Exception e) {
			System.out.println("une erreur a eu lieu ..." + e.getMessage());
			return "input";
		}
      }
	

	
	public Utilisateur getModel() {
		return this.utilisateur;
	}


	private SessionMap<String, Object> sessionMap;

	@Override
	public void setSession(Map<String, Object> map) {
		this.sessionMap=(SessionMap)map;		
	}
		
	
	

}
