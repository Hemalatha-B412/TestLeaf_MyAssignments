package week2.week2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("hemaharini412@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String leadName = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td[3]/div/a"))
				.getText();
		System.out.println("Lead name from the table " + leadName);
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td[3]/div/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		Thread.sleep(2000);
		String Title = driver.getTitle();
		System.out.println("Title is :" + Title);
		if (Title.contains("Duplicate Lead")) {
			System.out.println("Title is displayed as " + Title);
		}
		driver.findElement(By.name("submitButton")).click();
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(firstName);
		if (leadName.equals(firstName)) {
			System.out.println("Lead Name is duplicated");
		}
		driver.close();
	}
}