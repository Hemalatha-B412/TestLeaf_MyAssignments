package week3.day2assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String name = "hemalatha";
		char[] charr = name.toCharArray();
		Set<Character> ch = new LinkedHashSet<Character>();
		Set<Character>dupch = new LinkedHashSet<Character>();
		for(Character c:charr) {
			
			if(!ch.add(c)) {
				dupch.add(c);
			}
		}
		ch.removeAll(dupch);
		System.out.println("Printing Unique characters " +ch);
		}

	
}
	


