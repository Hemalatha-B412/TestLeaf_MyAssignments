package week2.week2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Hema");
		driver.findElement(By.name("lastname")).sendKeys("Latha");
		driver.findElement(By.name("reg_email__")).sendKeys("hemalatha412@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Hema@123456");
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("4");
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Dec");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1993");
		driver.findElement(By.name("sex")).click();
		driver.close();

	}

}
