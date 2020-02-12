package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class VowelsRunner
{
	public static void main( String a[] )
	{
		FirstLastVowel s = new FirstLastVowel();
			
		System.out.println(  s.go(  "dog#cat#pigaplus")    );
		System.out.println(  s.go(  "pigs#apluscompsci#food")    );
		System.out.println(  s.go(  "##catgiraffeapluscompsci")    );
		System.out.println(  s.go(  "apluscatsanddogsaplus###")    );
		System.out.println(  s.go(  "##")    );
		System.out.println(  s.go(  "aplusdog#13337#pigaplusprogram")    );
		System.out.println(  s.go(  "code#H00P#code1234")    );
		System.out.println(  s.go(  "##wowgira77##eplus")    );
		System.out.println(  s.go(  "catsandaplusdogsaplus###")    );
		System.out.println(  s.go(  "7")    );

	}
}


