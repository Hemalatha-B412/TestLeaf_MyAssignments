package week3.day2assignments;

public class ReverseString {

	public static void main(String[] args) {
		String s="Testleaf Learning";
        String[] split = s.split(" ");
        
       
       for(int i=0;i<split.length;i++) {
        	char[] charArray = split[i].toCharArray();
            for(int j=charArray.length-1;j>=0;j--) {
            	System.out.print(charArray[j]);
            }
        }
        
	}

}
