ackage DataLab;

public class Clinics {
	
	
	//the flu seasonyear
	private String season;
	
	//the postal code of a clinic in the CHICAGO AREA.
	private int postalCode;
	
	//street of the clinic
	private String street;
	
	private String state;
	private String city;

	public Clinics(String s, int pC, String street, String city, String state) {
		setSeason(s);
		setpostalCode(pC);
		setStreet(street);
		setState(state);
		setCity(city);
	}


//gets, sets, functions.
	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
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
