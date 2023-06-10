package week3.day1assignments;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("My Name is Hemalatha");
	}
	public void studentDept() {
		System.out.println("My Departmant Name is ECE");
	}
	public void studentId() {
		System.out.println("My Id is 12345");
	}
	public static void main(String[] args) {
		
		Student stud = new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentId();
		stud.studentDept();

	}

}
