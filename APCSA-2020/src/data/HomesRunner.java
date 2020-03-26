package data;

import java.util.ArrayList;
import java.util.Scanner;

import core.data.DataSource;

public class ClinicsRunner {

	public static void main(String[] args) {
		System.out.println("Cities with park, beach, open space, or coastline access in Cali.");
		
		//https://data.ca.gov/dataset/park-beach-open-space-or-coastline-access#
//https://data.chhs.ca.gov/dataset/ff3083ea-17cb-4fb2-b51e-183444515b67/resource/b810928a-80cd-4b7a-a4cd-e5dda9a34171/download/hciaccesstoparks-data-dictionary.xlsx
		DataSource DS = DataSource.connect("https://data.chhs.ca.gov/dataset/ff3083ea-17cb-4fb2-b51e-183444515b67/resource/b810928a-80cd-4b7a-a4cd-e5dda9a34171/download/hciaccesstoparks-data-dictionary.xlsx").load();

		DS.printUsageString();

		//the first part is the season, the second part is the postal code, and  then street adress, then  city, then state.
		ArrayList<Clinics> allClinics = DS.fetchList(Clinics.class, "row/row/", "row/row/postal_code", "row/row/street1", "row/row/city", "row/row/state");
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
