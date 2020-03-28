package data;

public class Spending {
	

	private String TotalExpend;
	private String Pop;
	private String Capita;
	private String FiscalYear;
	private String city;

	public Spending(int ID, String city, String FiscalYear, String TotalExpend, String Pop, String Capita) {
		setID(ID);
		setCity(city);
		setFiscalYr(FiscalYear);
		setTotal(TotalExpend);
		setPop(Pop);
		setCapita(Capita);
	}


//gets, sets, functions. buckle in this is LONg'
	public void String setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}

	public void String setFiscalYr(String FiscalYear) {
		this.FiscalYear = FiscalYear;
	}
	
	public String getFiscalYear() {
		return FiscalYear;
	}
	
	public void String setTotalExpend(String TotalExpend) {
		this.TotalExpend =  TotalExpend;
	}
	
	public void String setPop() {
	}


}
