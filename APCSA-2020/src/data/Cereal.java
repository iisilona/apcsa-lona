package DataLab;
import static java.lang.System.*;

public class Cereal {
	
	
	//variables etc
	private int protein;
	private double carbs;
	private String name;
	private int rank;
	
	
	public Cereal()
	{
		
	}

	
	//constructors
	public Cereal (String n, double c, int p)
	{
		setCarbs(c);
		setProtein(p);
		setName(n);
	}
	
	
	//carbs
	public double getCarbs()
	{
		return carbs;
	}
		
	public void setCarbs( double c )
	{
		carbs = c;
	}
	
	
	//proteins
	public int getProtein()
	{
		return protein;
	}
	
	public void setProtein( int p) {
		protein = p;
	}

	public String getName()
	{
		return name;
	}
		
	public void setName( String n )
	{
		name = n;
	}
	
	public int getRank()
	{
		return rank;
	}
		
	public void setRank( int r )
	{
		rank = r;
	}
	
	
	public String toString()
	{
	   return "Cereal: " + name + ", Protein: " + protein + "carbs: " + carbs;
	}
}
