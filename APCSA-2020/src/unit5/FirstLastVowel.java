//(c) A+ Computer Science
//www.apluscompsci.com
package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
public class FirstLastVowel
{
   public static String go( String a )
	{
       char lastLetter = 'a' ;
	   char firstLetter = 'a' ;
	   
	 if (a.length() > 1) {
	   lastLetter = a.charAt(a.length()-1);
	  firstLetter = a.charAt(0);
	  }
       
       if (a.length() == 1) {
    	   lastLetter = a.charAt(0);
    	  firstLetter = lastLetter;
    	  }
	
       if (a.length() == 0) {
    	   return "no";
         }
       
	switch (firstLetter)
	{
	 case 'a':
		 return "yes";
	 case 'A':
		 return "yes";
	 case 'e':
		 return "yes";
	 case 'E':
		 return "yes";
	 case 'i':
		 return "yes";
	 case 'I':
		 return "yes";
	 case 'o':
		 return "yes";
	 case 'O':
		 return "yes";
	 case 'u':
		 return "yes";
	 case 'U':
		 return "yes";
	}
	
	switch (lastLetter)
	{
	 case 'a':
		 return "yes";
	 case 'A':
		 return "yes";
	 case 'e':
		 return "yes";
	 case 'E':
		 return "yes";
	 case 'i':
		 return "yes";
	 case 'I':
		 return "yes";
	 case 'o':
		 return "yes";
	 case 'O':
		 return "yes";
	 case 'u':
		 return "yes";
	 case 'U':
		 return "yes";
	}
	   return "no";
	}
}