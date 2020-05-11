package tp.web.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import tp.dao.ProduitDao;
import tp.dao.simu.ProduitDaoStub;
import tp.web.data.Produit;
import tp.web.data.Selection;  

public class CaddyAction extends ActionSupport implements ModelDriven<Selection> , SessionAware{
	
	private SessionMap<String,Object> sessionMap;  
	
	@Override //from SessionAware (for session injection)
	public void setSession(Map<String, Object> map) {
		sessionMap=(SessionMap)map; 
	}
	
	private List<Selection> listeSelection = null; //caddy
	private Selection selection = new Selection();//model bean instance (for input)
	
    private ProduitDao prodDao = ProduitDaoStub.getInstance();//singleton (dao stub without DB, memoryMap)
	private List<Produit> produitList = new ArrayList<Produit>();
	
	public String ajouterDansCaddy(){
		getListeSelection().add(selection);
		return SUCCESS;
	}
	
	public String loadListeProduits(){
		this.setProduitList(prodDao.allProduit());//store in session
		return SUCCESS;
	}
	
	public String listerContenuCaddy(){
		this.getListeSelection(); //in session
		return SUCCESS;
	}

	@Override
	public Selection getModel() {
		return selection;
	}

	public List<Selection> getListeSelection() {
		this.listeSelection = (List<Selection>)this.sessionMap.get("caddy");
		if(this.listeSelection==null){
			this.listeSelection = new ArrayList<Selection>();
			this.sessionMap.put("caddy", listeSelection);
		}
		return listeSelection;
	}

	public void setListeSelection(List<Selection> listeSelection) {
		this.listeSelection = listeSelection;
		this.sessionMap.put("caddy", listeSelection);
	}

	public Selection getSelection() {
		return selection;
	}

	public void setSelection(Selection selection) {
		this.selection = selection;
		
	}

	public ProduitDao getProdDao() {
		return prodDao;
	}

	public void setProdDao(ProduitDao prodDao) {
		this.prodDao = prodDao;
	}

	public List<Produit> getProduitList() {
		this.produitList = (List<Produit>)this.sessionMap.get("produits");
		if(this.produitList==null){
			this.produitList = new ArrayList<Produit>();
			this.sessionMap.put("produits", produitList);
		}
		return produitList;
	}

	public void setProduitList(List<Produit> produitList) {
		this.produitList = produitList;
		this.sessionMap.put("produits", produitList);
	}

	

}
