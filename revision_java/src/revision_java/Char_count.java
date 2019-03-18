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
		/*
		//to count only letters and avoid the numbers
		String t = "I am newhaven 2365, greatness in plethora";
		int frog=0;
		for(int j=0;j<t.length();j++) {
			char z = t.charAt(j);
			if()
			boolean b = t.isLetter(j);
			while(b) {
				frog++;	
			}
		}
		System.out.println("length of just letters excluding numbers = "+frog);
		*/
		
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
			while(!letters.isEmpty()) {
				System.out.println(a.charAt(x) + letters.get(a.charAt(x))); 
			}
				 
				/*
				Set setA = new HashSet();

				setA.add(a.charAt(x) + " "+lol);
				Iterator iterator = setA.iterator();
				while(iterator.hasNext()){
					  String element = (String) iterator.next();
					  System.out.println(element);
					}
				//System.out.println(a.charAt(x) + " "+lol);
				 */
				 
		}
	}

}
