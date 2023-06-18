package week2.week2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hemalatha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("B");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Hema");
		driver.findElement(By.name("departmentName")).sendKeys("May 23 Batch");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("hemaharini412@gmail.com");
		Select source = new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		source.selectByVisibleText("Employee");
		Select markCampId = new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
		markCampId.selectByValue("9001");
		Select ownership = new Select(driver.findElement(By.id("createLeadForm_ownershipEnumId")));
		ownership.selectByIndex(5);
		Select state = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		state.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(2000);
		String Title = driver.getTitle();
		System.out.println("Title is :" +Title);
	}

}
