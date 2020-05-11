package tp.web.data;

public class User {
	private Long id;
	private String name;
	private String gender;//"Male" or "Female"
	private String country;//"France","USA", "UK", ...
	private String aboutYou;
	private Boolean wishToBeInMailingList;
	
	
	public User() {
		super();		
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", gender=" + gender + ", country=" + country + ", aboutYou="
				+ aboutYou + ", wishToBeInMailingList=" + wishToBeInMailingList + "]";
	}

	public User(Long id, String name, String gender, String country, String aboutYou, Boolean wishToBeInMailingList) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.country = country;
		this.aboutYou = aboutYou;
		this.wishToBeInMailingList = wishToBeInMailingList;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAboutYou() {
		return aboutYou;
	}
	public void setAboutYou(String aboutYou) {
		this.aboutYou = aboutYou;
	}
	public Boolean getWishToBeInMailingList() {
		return wishToBeInMailingList;
	}
	public void setWishToBeInMailingList(Boolean wishToBeInMailingList) {
		this.wishToBeInMailingList = wishToBeInMailingList;
	}

	
	
}
