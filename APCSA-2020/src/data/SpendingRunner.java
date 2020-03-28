package data;

import java.util.ArrayList;
import java.util.Scanner;

import core.data.DataSource;

public class SpendingRunner {

	public static void main(String[] args) {
		System.out.println("City expenditures:");
	 	
		//https://bythenumbers.sco.ca.gov/api/views/ykhf-vfsr/rows.xml?accessType=DOWNLOAD
		DataSource DS = DataSource.connect("https://bythenumbers.sco.ca.gov/api/views/ykhf-vfsr/rows.xml?accessType=DOWNLOAD").load();

		DS.printUsageString();

		//tells you how many data points we have
		ArrayList<Spending> allSpending = DS.fetchList(Spending.class, "row/row/entity_name", "row/row/fiscal_year", "row/row/total_expend", "row/row/pop", "row/row/per_capita");
		System.out.println("Amount of Data collected between 2003-2017: " + allSpending.size() + "entries");
		
		//input a fiscal year
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Fiscal Year (between 2003 and 2017, please!): ");
		//sets their output to season.
		String yr = scanner.next();		
		
		for (Spending s : allSpending) {
			if (s.getyr().equalsIgnoreCase(fiscal_year)) {
				System.out.println("Spending for the" + s.getFiscalYear() + " is" + s.getTotalExpenditures() + ". Population is" + cl.getPop() + "Spending per capita is" + cl.getCapita());
			}
		}

	}
}
