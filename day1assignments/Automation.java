package week3.day1assignments;

public class Automation extends MultipleLanguage implements Language,TestTool{

	public static void main(String[] args) {
		Automation au = new Automation();
		au.java();
		au.selenium();
		au.ruby();
		au.python();

	}

	public void selenium() {
		
		System.out.println("Learning selenium automation");
	}

	public void java() {
		
		System.out.println("Language is Java");
	}

	
	public void ruby() {
		
		System.out.println("Language is Ruby");
	}

}
