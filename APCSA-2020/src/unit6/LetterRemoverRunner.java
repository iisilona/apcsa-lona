package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import unit5.wordsCompare;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover s = new LetterRemover();
		s.setRemover("I am Sam I am", 'a');
		System.out.println(s.toString());
		s.removeLetters();
		System.out.println(s.finalString());
		
		s.setRemover("ssssssssxssssesssssesss", 's');
		System.out.println(s.toString());
		s.removeLetters();
		System.out.println(s.finalString());
		
		s.setRemover("qwertyqwertyqwerty", 'a');
		System.out.println(s.toString());
		s.removeLetters();
		System.out.println(s.finalString());
		
		s.setRemover("abababababa", 'b');
		System.out.println(s.toString());
		s.removeLetters();
		System.out.println(s.finalString());
		
		s.setRemover("abaababababa", 'x');
		System.out.println(s.toString());
		s.removeLetters();
		System.out.println(s.finalString());
											
	}
}