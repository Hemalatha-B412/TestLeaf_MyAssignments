package week3.day1assignments;

public class Students {
	public void getStudentInfo(int id) {

		System.out.println("Student Id is " +  id);
	}

	public void getStudentInfo(int id, String name) {

		System.out.println("Student Id is " +  id + "  Student Name is " +  name);
	}

	public void getStudentInfo(String email, String phNo) {

		System.out.println("Student Email Address is " + email + "  Student Ph No is " + phNo);
	}

	public static void main(String[] args) {
		Students studInfo = new Students();
		studInfo.getStudentInfo(100);
		studInfo.getStudentInfo(101, "Hemalatha");
		studInfo.getStudentInfo("hemaharini412@gmail.com", "8056202530");
	}

}
