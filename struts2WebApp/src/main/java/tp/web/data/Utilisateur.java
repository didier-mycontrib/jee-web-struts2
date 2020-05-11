package tp.web.data;

import java.util.Date;

public class Utilisateur {
	private Long id;
	private String pseudo;
	private Integer age;
	private String email;
	private String numeroEtRue;
	private String codePostal;
	private String ville;
	private Date dateInscription;
	
	
	public Utilisateur() {
		super();
	}
	
	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", pseudo=" + pseudo + ", age=" + age + ", email=" + email + ", numeroEtRue="
				+ numeroEtRue + ", codePostal=" + codePostal + ", ville=" + ville + ", dateInscription="
				+ dateInscription + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumeroEtRue() {
		return numeroEtRue;
	}
	public void setNumeroEtRue(String numeroEtRue) {
		this.numeroEtRue = numeroEtRue;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public Date getDateInscription() {
		return dateInscription;
	}
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}
	
	
}
