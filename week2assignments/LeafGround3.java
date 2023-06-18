package week2.week2assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGround3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Select tool = new Select(driver.findElement(By.className("ui-selectonemenu")));
		tool.selectByVisibleText("Selenium");
		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='India']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		List<WebElement> city = driver
				.findElements(By.xpath("//div[@class='ui-selectonemenu-items-wrapper']//following::ul/li"));
		for (int i = 0; i < city.size(); i++) {
			String options = city.get(i).getText();
			System.out.println(options);
		}
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		driver.findElement(By.xpath("//li[text()='English']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Select Values']")).click();
		driver.findElement(By.xpath("//li[text()='Two']")).click();
		driver.close();

	}

}
