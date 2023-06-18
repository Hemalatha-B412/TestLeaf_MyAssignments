package week2.week2assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround4 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//span[text()='Basic']/preceding-sibling::div)[2]")).click();
		driver.findElement(By.xpath("(//span[text()='Ajax']/preceding-sibling::div)[2]")).click();
		driver.findElement(By.xpath("//label[text()='Java']/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//label[text()='Python']/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ']/parent::div")).click();
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		boolean chkbox = driver.findElement(By.xpath("//span[text()='Disabled']//preceding::div/input[@id='j_idt87:j_idt102_input']")).isEnabled();
		
		System.out.println(chkbox);
		driver.findElement(By.xpath("(//h5[text()='Select Multiple']/following::div)[1]")).click();
		List<WebElement> options = driver
				.findElements(By.xpath("//div[@class='ui-selectcheckboxmenu-items-wrapper']//li/div"));
		for (int i = 0; i < options.size(); i++) {

			options.get(i).click();

		}

	}

}
