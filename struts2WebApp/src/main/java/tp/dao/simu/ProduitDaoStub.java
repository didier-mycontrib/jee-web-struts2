package tp.dao.simu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tp.dao.ProduitDao;
import tp.web.data.Produit;

public class ProduitDaoStub implements ProduitDao{
	
	private static ProduitDaoStub uniqueInstance =null;
	
	public static ProduitDaoStub getInstance(){
		if(uniqueInstance==null) {
			uniqueInstance=new ProduitDaoStub();
			uniqueInstance.initProdList();
		}
		return uniqueInstance;
	}
	
	//ici simulation en memoire (sans Database) via map(idUser,user)
	private Map<Long,Produit> prodMap = new HashMap<Long,Produit>();
	private Long lastId=0L; //for auto_incr
	
	private void initProdList(){
		lastId++;	prodMap.put(lastId,new Produit(lastId,"stylo",1.23));
		lastId++;	prodMap.put(lastId,new Produit(lastId,"cahier",2.56));
		lastId++;	prodMap.put(lastId,new Produit(lastId,"gomme",1.56));
	}
	

	@Override
	public void saveOrUpdateProduit(Produit prod) {
		if(prod.getNumero()==null){
			prod.setNumero(++lastId);
		}
		prodMap.put(prod.getNumero(), prod);
	}

	@Override
	public void removeProduit(Long numero) {
		prodMap.remove(numero);
	}

	@Override
	public List<Produit> allProduit() {
		return new ArrayList<Produit>(prodMap.values());
	}

	@Override
	public  Produit prodByNum(Long numero) {
		return prodMap.get(numero);
	}
	
	
}
