package unit13;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class WordSortTwoRunner {
	public static void main(String args[]) throws IOException {
		Scanner file = new Scanner(new File("src/Unit13/wordsorttwo.dat"));
		int size = file.nextInt();
		file.nextLine();
		for (int i = 0; i < size; i++) {
			String sentence = file.nextLine();
			// instantiate a new WordSortTwo Objects
			WordSortTwo w = new WordSortTwo(sentence);
			w.sort();
			System.out.println(w);
		}
	}
}
