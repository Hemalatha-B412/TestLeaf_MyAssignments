package week3.day2assignments;

public class Palindrome {

	public static void main(String[] args) {
		String text = "madam";
		String rev = "";
		for(int i=text.length()-1;i>=0;i--) {
			rev=rev+text.charAt(i);
		}
		System.out.println(rev);	
		if(text.equals(rev)) {
			System.out.println("The given string is palindrome");
		}
		else {
			System.out.println("The given string is not an palindrome");
		}

	}

}
