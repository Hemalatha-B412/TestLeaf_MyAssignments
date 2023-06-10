package week3.day1assignments;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Deposited the amount in Axis Bank");
	}

	public static void main(String[] args) {
		AxisBank axis = new AxisBank();
		axis.deposit();

	}
}
