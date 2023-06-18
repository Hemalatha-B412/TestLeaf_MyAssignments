package week3.day2assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 8, 10, 9, 2, 4, 3, 2, 5, 8, 6 };
		Set<Integer> numbers = new TreeSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			numbers.add(arr[i]);
		}
		System.out.println(numbers);
		List<Integer> listelements = new ArrayList<Integer>(numbers);
		for(int i=0;i<listelements.size();i++) {
			if(listelements.get(i)!=i+1) {
				System.out.println("Missing number is :"+ (i+1));
				break;
			}
		}
	}

}
