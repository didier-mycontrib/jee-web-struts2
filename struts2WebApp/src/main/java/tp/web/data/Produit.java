package tp.web.data;

public class Produit {
	
	private Long numero;
	private String label;
	private Double prix;
	

	public Produit() {
		super();
	}
	
	public Produit(Long numero, String label, Double prix) {
		super();
		this.numero = numero;
		this.label = label;
		this.prix = prix;
	}
	
	
	
	@Override
	public String toString() {
		return "Produit [numero=" + numero + ", label=" + label + ", prix=" + prix + "]";
	}

	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	
	

}
