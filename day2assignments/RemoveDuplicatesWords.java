package week3.day2assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		Set<String> removeduplicates = new LinkedHashSet<String>();
		for (int i = 0; i < split.length; i++) {
			removeduplicates.add(split[i]);
		}
		System.out.println("Printing the set without duplicates" + removeduplicates);
	}
}