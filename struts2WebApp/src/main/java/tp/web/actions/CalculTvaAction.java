package tp.web.actions;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.validation.SkipValidation;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import tp.web.data.MyAnnexeBean;

public class CalculTvaAction extends ActionSupport implements Preparable{
	
	private static final long serialVersionUID = 1L;
	private String stHt;
	private double ht;
	private String stTaux;//en %
	private double taux;
	private Double tva;
	private Double ttc;
	
	private String message="";
	
	@Override //from interface Preparable
	//prepare() est la première fois appelée avant input()
	public void prepare() throws Exception {
		stHt="200";
		stTaux="20"; //valeur par defaut
	}
	
	@SkipValidation
	public String init(){
		System.out.println("init");
		HttpServletRequest request = (HttpServletRequest)
		ActionContext.getContext().get( ServletActionContext.HTTP_REQUEST);
		request.setAttribute("annexe",new MyAnnexeBean(2L,"coucou"));
		
		return "success";
	}
	
	
	public String getStHt() {
		return stHt;
	}
	public void setStHt(String stHt) {
		this.stHt = stHt;
	}
	public String getStTaux() {
		return stTaux;
	}
	public void setStTaux(String stTaux) {
		this.stTaux = stTaux;
	}
	public Double getTva() {
		return tva;
	}
	public void setTva(Double tva) {
		this.tva = tva;
	}
	public Double getTtc() {
		return ttc;
	}
	public void setTtc(Double ttc) {
		this.ttc = ttc;
	}
	
	
	
	@Override
	public void validate() {
		super.validate();
		System.out.println("Dans la methode validate de " + this.toString());
		if(this.stHt== null || this.stHt.isEmpty()) {
			this.message="le champ ht ne doit pas etre vide...";
			this.addFieldError("stHt", message);
			System.out.println(message);
		}
		else {
			try{
				ht= Double.parseDouble(this.stHt);
			}catch(Exception e){
				this.addFieldError("stHt", "pas numerique ! " + stHt);
			}
		}
		if(this.stTaux==null || this.stTaux.isEmpty()) {
			this.message = "le champ taux ne doit pas etre vide...";
			this.addFieldError("stTaux", message);
			System.out.println(message);
		}
		else {
			try{
				taux= Double.parseDouble(this.stTaux);
			}catch(Exception e){
				this.addFieldError("stTaux", "pas numerique ! " + stTaux);
			}
		}
		
	}


	public String calculer() {
		System.out.println("Dans la methode calculer de " + this.toString());
		
		
		  try {
			  this.tva = ht  * taux / 100;
			  this.ttc = ht  + this.tva;
			  if(tva < 0 ){
				  this.addActionError("tva négative anormale");
				  return "input";
			  }
			  else{
			  System.out.println("Sucess........."); 
			  return "success";
			  }
		} catch (Exception e) {
			this.message="une erreur de calcul ..." + e.getMessage();
			System.out.println(this.message);
			return "input";
		}
      }

	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	

}
