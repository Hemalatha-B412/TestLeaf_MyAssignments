package week3.day2assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "PayPal India";
		char[] chArr = text.toCharArray();
		Set<Character> chSet = new LinkedHashSet<Character>();
		Set<Character> dupchSet = new LinkedHashSet<Character>();
		for(int i=0;i<chArr.length;i++) {
			if(!chSet.add(chArr[i])) {
				dupchSet.add(chArr[i]);
			}
			
		}
		chSet.removeAll(dupchSet);
		List<Character> printch = new ArrayList<Character>(chSet);
		
		for (int i=0; i<printch.size();i++)
		{
			char charVal= printch.get(i).charValue();
			if(charVal!=' ') {
		    System.out.print(charVal);
			}
		}
	}
	
}
