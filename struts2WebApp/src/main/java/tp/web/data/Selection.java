package tp.web.data;

public class Selection {
	Long numProduit;
	Integer quantite=1;
	
	
	@Override
	public String toString() {
		return "Selection [numProduit=" + numProduit + ", quantite=" + quantite + "]";
	}

	public Selection() {
		super();
	}
	

	public Long getNumProduit() {
		return numProduit;
	}

	public void setNumProduit(Long numProduit) {
		this.numProduit = numProduit;
	}

	public Integer getQuantite() {
		return quantite;
	}
	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}
	
	
}
