package week3.day1assignments;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("Desktop size is medium");
	}
	public static void main(String[] args) {
		
		Desktop d = new Desktop();
		d.computerModel();
		d.desktopSize();

	}

}
