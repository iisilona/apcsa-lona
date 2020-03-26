package DataLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import core.data.DataSource;

public class CerealRunner {
/*
 * 1	100% Bran	N	C	70	4	1	130	10	5	6	280	25	3	1	0.33	68.402973
2	100% Natural Bran	Q	C	120	3	5	15	2	8	8	135	0	3	1	1	33.983679
3	All-Bran	K	C	70	4	1	260	9	7	5	320	25	3	1	0.33	59.425505
4	All-Bran with Extra Fiber	K	C	50	4	0	140	14	8	0	330	25	3	1	0.5	93.704912
5	Almond Delight	R	C	110	2	2	200	1	14	8	-1	25	3	1	0.75	34.384843
6	Apple Cinnamon Cheerios	G	C	110	2	2	180	1.5	10.5	10	70	25	1	1	0.75	29.509541
7	Apple Jacks	K	C	110	2	0	125	1	11	14	30	25	2	1	1	33.174094
8	Bran Chex	C	130	3	2	210	2	18	8	100	25	3	1.33	0.75	37.038562
9	Bran Chex	R	C	90	2	1	200	4	15	6	125	25	1	1	0.67	49.120253
10	Bran Flakes	P	C	90	3	0	210	5	13	5	190	25	3	1	0.67	53.313813
11	Cap'n'Crunch	Q	C	120	1	2	220	0	12	12	35	25	2	1	0.75	18.042851
12	Cheerios	G	C	110	6	2	290	2	17	1	105	25	1	1	1.25	50.764999
13	Cinnamon Toast Crunch	G	C	120	1	3	210	0	13	9	45	25	2	1	0.75	19.823573
14	Clusters	G	C	110	3	2	140	2	13	7	105	25	3	1	0.5	40.400208
15	Cocoa Puffs	G	C	110	1	1	180	0	12	13	55	25	2	1	1	22.736446
16	Corn Chex	R	C	110	2	0	280	0	22	3	25	25	1	1	1	41.445019
17	Corn Flakes	K	C	100	2	0	290	1	21	2	35	25	1	1	1	45.863324
18	Corn Pops	K	C	110	1	0	90	1	13	12	20	25	2	1	1	35.782791
19	Count Chocula	G	C	110	1	1	180	0	12	13	65	25	2	1	1	22.396513
20	Cracklin' Oat Bran	K	C	110	3	3	140	4	10	7	160	25	3	1	0.5	40.448772
21	Cream of Wheat (Quick)	N	H	100	3	
 */
	
	
	
	
	
	public static void main(String[] args) {
		ArrayList<String> cerealnames = new ArrayList();
		cerealnames.add("100% Bran");
		cerealnames.add("100% Natural Bran");
		cerealnames.add("All-Bran");
		cerealnames.add("All-Bran with Extra Fiber");
		cerealnames.add("Almond Delight");
		cerealnames.add("Apple Cinnamon Cheerios");
		cerealnames.add("Apple Jacks");
		cerealnames.add("Basic 4 G");
		cerealnames.add("Bran Chex");
		cerealnames.add("Bran Flakes");
		cerealnames.add("Cap'n'Crunch");
		cerealnames.add("Cheerios");
		cerealnames.add("Cinnamon Toast Crunch");
		cerealnames.add("Clusters");
		cerealnames.add("Corn Chex");
		cerealnames.add("Corn Flakes");
		cerealnames.add("Corn Pops");
		cerealnames.add("Count Chocula");
		cerealnames.add("Cracklin' Oat Bran");
		cerealnames.add("100% Bran");
		cerealnames.add("Cream of Wheat (Quick)");
		
		ArrayList<Double> cerealcarbs = new ArrayList();
		cerealcarbs.add((double) 5);
		cerealcarbs.add((double) 8);
		cerealcarbs.add((double) 7);
		cerealcarbs.add((double) 8);
		cerealcarbs.add((double) 14);
		cerealcarbs.add(10.5);
		cerealcarbs.add((double) 11);
		cerealcarbs.add((double) 18);
		cerealcarbs.add((double) 15);
		cerealcarbs.add((double) 13);
		cerealcarbs.add((double) 12);
		cerealcarbs.add((double) 17);
		cerealcarbs.add((double) 13);
		cerealcarbs.add((double) 13);
		cerealcarbs.add((double) 12);
		cerealcarbs.add((double) 22);
		cerealcarbs.add((double) 21);
		cerealcarbs.add((double) 13);
		cerealcarbs.add((double) 12);
		cerealcarbs.add((double) 10);
		cerealcarbs.add((double) 21);
		
		
		ArrayList<Integer> cerealprot = new ArrayList();
		cerealprot.add( 4);
		cerealprot.add( 3);
		cerealprot.add( 4);
		cerealprot.add( 4);
		cerealprot.add( 2);
		cerealprot.add(2);
		cerealprot.add( 2);
		cerealprot.add( 3);
		cerealprot.add( 2);
		cerealprot.add( 3);
		cerealprot.add( 1);
		cerealprot.add( 6);
		cerealprot.add( 1);
		cerealprot.add( 3);
		cerealprot.add( 1);
		cerealprot.add( 2);
		cerealprot.add( 2);
		cerealprot.add( 1);
		cerealprot.add( 1);
		cerealprot.add( 3);
		cerealprot.add( 3);
		
		
		ArrayList<Cereal> allcereals = new ArrayList();
		
		//updates list with names.
		for (int i = 0; i < cerealnames.size();i++) {
			allcereals.add(new Cereal());
			allcereals.get(i).setName(cerealnames.get(i));
			allcereals.get(i).setCarbs(cerealcarbs.get(i));
			allcereals.get(i).setProtein(cerealprot.get(i));
		}
		
		ArrayList<Cereal> allcerealscopy = new ArrayList();
		for (int i = 0; i < allcerealscopy.size();i++) {
			allcerealscopy.add(new Cereal());
			allcerealscopy.get(i).setName(cerealnames.get(i));
			allcerealscopy.get(i).setCarbs(cerealcarbs.get(i));
			allcerealscopy.get(i).setProtein(cerealprot.get(i));
		}
		
		
		/*
		
		//INCOMPLETE WITHOUT CEREAL DATA SET.
		
		//note to self, find cereal data source later. 
		DataSource cereals = DataSource.connect("").load();
		cereals.printUsageString();
		//note to self, find cereal data source later. Don't currently have one.
		System.out.println("Total Number of Cereals: " + allcereals.size());
		
		*/
		
		//look for highest protein
		/*int highprot = 0;
		String highprotcer = "";
		//look for lowest carbs
		double lowcarbs = 100000000;
		String lowcarbcer = "";
		*/
	
		double temp1 = 0;
		int temp2 = 0;
		
		//Bubble Sort Descending for the cereals by carb.
		for (int i = 0; i < allcerealscopy.size()-1;i++) {
			for (int j = 1; j < allcerealscopy.size() - i; j++) {
				if (allcerealscopy.get(j - 1).getCarbs() < allcerealscopy.get(j).getCarbs()) {
					temp1 = allcerealscopy.get(j-1).getCarbs();
					allcerealscopy.get(j-1).setCarbs(allcerealscopy.get(j).getCarbs());
					allcerealscopy.get(j).setCarbs(temp1);
				}
			}
		}
		
		//Bubble Sort Ascedning for the cereals by prot
		for (int i = 0; i < allcereals.size()-1;i++) {
			for (int j = 1; j < allcereals.size() - i; j++) {
				if (allcereals.get(j - 1).getProtein() > allcereals.get(j).getProtein()) {
					temp2 = allcereals.get(j-1).getProtein();
					allcereals.get(j-1).setProtein(allcereals.get(j).getProtein());
					allcereals.get(j).setProtein(temp2);
				}
			}
		}
		
		
		int temprankstorage = 0;
		for (int i = 0; i < allcereals.size();i++) {
			for (int j = 0; j < allcereals.size();j++) {
				if (cerealnames.get(j).equals(allcereals.get(j).getName())) {
					temprankstorage = j;
				}
			}
			for (int j = 0; j < allcerealscopy.size();j++) {
				if (cerealnames.get(j).equals(allcerealscopy.get(j).getName())) {
					allcereals.get(j).setRank(j + temprankstorage);
				}
			}
		}
		
		for (int i = 0; i < allcereals.size() - 1;i++) {
			for (int j = 1; j < allcereals.size() - i; j++) {
				if (allcereals.get(j - 1).getRank() > allcereals.get(j).getRank()) {
					temp2 = allcereals.get(j-1).getRank();
					allcereals.get(j-1).setRank(allcereals.get(j).getRank());
					allcereals.get(j).setRank(temp2);
				}
			}
		}

		System.out.println("The Cereal with the most protein and least carbs Combination is: " + allcereals.get(0).getName());

	}

}
