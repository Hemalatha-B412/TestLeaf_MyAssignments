package week3.day2assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] str = { "HCL", "Wipro", "Aspire Systems", "CTS" };
		List<String> strList = new ArrayList<String>();
		//strList.addAll(Arrays.asList(str)); - to convert array to list without for loop
		for(int i=0;i<str.length;i++) {
			strList.add(str[i]);
		}
		System.out.println(strList);
		Collections.sort(strList);
		System.out.println("After Sorting" +strList);
		int len = strList.size();
		
		List<String> revList = new ArrayList<String>();
		for (int i = len - 1; i >= 0; i--) {
			revList.add(strList.get(i));
		}
		System.out.print( revList);


	}

}
