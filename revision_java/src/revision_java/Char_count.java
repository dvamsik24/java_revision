package revision_java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Char_count {
	
	public static void main(String[] args) {
		
		//to count string length including the spaces
		String s = "My name is Khan and I am not a terrorist";
		System.out.println("lenth of String including spaces = "+s.length());
		
		//to count string length excluding the spaces
		System.out.println("length of String excluding spaces = "+s.replace(" ", "").length());
		System.out.println(s);
		
		//another way to count number of just characters
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("length of just characters = "+count);
		
		
		String test = "Hello World zZz";
		String a = test.toLowerCase();
		for(int x=0;x<=a.length()-1;x++) {
			int lol=0;
			for(int y=0;y<a.length();y++) {
				//System.out.println(a.charAt(x)+ " ---- to match ---" + a.charAt(y));
				
				if(a.charAt(x)==a.charAt(y)) {
					lol++;
				}
				
			}
			HashMap letters = new HashMap();
			letters.put(a.charAt(x), lol);
		}
	}

}
