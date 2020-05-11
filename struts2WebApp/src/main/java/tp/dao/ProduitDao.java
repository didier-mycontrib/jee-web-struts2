package tp.dao;

import java.util.List;

import tp.web.data.Produit;

public interface ProduitDao {
	
	public void saveOrUpdateProduit(Produit prod) ;
	public void removeProduit(Long numero) ;
	public List<Produit> allProduit() ;
	public Produit prodByNum(Long numero) ;

}
