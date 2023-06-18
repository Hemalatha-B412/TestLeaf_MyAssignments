package week2.week2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Hemalatha");
		driver.findElement(By.id("lastNameField")).sendKeys("B");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Hema");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Latha");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Test Automation");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("hemalatha@gmail.com");
		Select state = new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
		state.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Learning Selenium");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		Thread.sleep(2000);
		String Title = driver.getTitle();
		System.out.println("Title is :" +Title);

	}

}
