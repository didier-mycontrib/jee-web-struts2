package tp.web.data;

public class MyAnnexeBean {
	private Long numero;
	private String label;
	
	public MyAnnexeBean(){
		this(0L,"?");
	}
	
	
	public MyAnnexeBean(Long numero, String label) {
		super();
		this.numero = numero;
		this.label = label;
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
	
}
