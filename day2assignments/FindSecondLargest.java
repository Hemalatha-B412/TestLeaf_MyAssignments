package week3.day2assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };
		Set<Integer> num = new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			num.add(data[i]);
		}
		System.out.println(num);

		List<Integer> listelements = new ArrayList<Integer>(num);
		int n = listelements.size() - 2;
		System.out.println(listelements.get(n));

	}
}