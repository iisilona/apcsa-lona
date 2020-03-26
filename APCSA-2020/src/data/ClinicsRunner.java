package data;

import java.util.ArrayList;
import java.util.Scanner;

import core.data.DataSource;

public class ClinicsRunner {

	public static void main(String[] args) {
		System.out.println("Postal codes for Chicago area Clinics specializing in disease prevention.");
		
		//https://data.cityofchicago.org/api/views/w3hg-pyhz/rows.xml?accessType=DOWNLOAD
		DataSource DS = DataSource.connect("https://data.cityofchicago.org/api/views/w3hg-pyhz/rows.xml?accessType=DOWNLOAD").load();

		DS.printUsageString();

		//the first part is the season, the second part is the postal code, and  then street adress, then  city, then state.
		ArrayList<Clinics> allClinics = DS.fetchList(Clinics.class, "row/row/season", "row/row/postal_code", "row/row/street1", "row/row/city", "row/row/state");
		System.out.println("Number of Clinics: " + allClinics.size());

		
		//lets people input a medical season.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Medical Season ('2014-2015', '2015-2016', '2016-2017', '2017-2018', '2018-2019', '2019-2020'): ");
		//sets their output to season.
		String season = scanner.next();		
		
		for (Clinics cl : allClinics) {
			if (cl.getSeason().equalsIgnoreCase(season)) {
				//if matches to required year, returns a nice formatted address of the clinic.
				//for some reason the state feature doesn't work.
				System.out.println("Clinic Location: " + cl.getStreet() + ", " + cl.getCity() + ", " + cl.getState() + ", " + cl.getpostalCode());
			}
		}

	}
}
