package week3.day2assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String text = "changeme";
		char[] charArray = text.toCharArray();
		
		for(int i=0;i<charArray.length;i++) {
			if(i%2 != 0) {
				System.out.print(Character.toUpperCase(charArray[i]));
			}
			else {
				System.out.print(charArray[i]);
			}
		}

	}

}
