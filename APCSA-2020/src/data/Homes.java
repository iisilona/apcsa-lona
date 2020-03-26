package data;

public class Homes {
	
	
	//the neighborhood in SD
	private String Neighborhood;
	
	//the postal code of said neighborhood
	private int postalCode;
	
	//street name
	private String street;
	
	private String state;
	private String city;

	public Clinics(String s, int pC, String street, String city, String state) {
		setNeighborhood(s);
		setpostalCode(pC);
		setStreet(street);
		setState(state);
		setCity(city);
	}


//gets, sets, functions.
	public String getNbhd() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public int getpostalCode() {
		return postalCode;
	}

	public void setpostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}


}
