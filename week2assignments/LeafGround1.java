package week2.week2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//h5[text()='Type your name']/following::input[@placeholder='Babu Manickam']")).sendKeys("Hemalatha");
		driver.findElement(By.xpath("//h5[text()='Append Country to this City.']/following::input[@value='Chennai']")).sendKeys(" India");
		System.out.println(driver.findElement(By.xpath("//h5/following::input[@placeholder='Disabled']")).isEnabled());
		driver.findElement(By.xpath("//h5/following::input[@value='Can you clear me, please?']")).clear();
		String text = driver.findElement(By.xpath("//h5/following::input[contains(@value,'My learning')]")).getAttribute("value");
		System.out.println(text);
		driver.findElement(By.xpath("//h5/following::input[contains(@placeholder,'Your email')]")).sendKeys("hemaharini412@gmail.com");
		driver.findElement(By.xpath("//h5/following::input[contains(@placeholder,'Your email')]")).sendKeys(Keys.TAB);
		
		driver.findElement(By.xpath("//h5/following::textarea[@placeholder='About yourself']")).sendKeys("I am from Ambattur");
		driver.findElement(By.xpath("//h5/following::textarea[@placeholder='About yourself']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("(//button[@class='ql-bold'])[1]")).click();
		//driver.findElement(By.xpath("(//*[name()='svg']//*[local-name()='path'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]")).sendKeys("Learning Automation");
		driver.findElement(By.xpath("(//h5/following::input[@aria-readonly='false'])[7]")).sendKeys(Keys.ENTER);
		String text1 = driver.findElement(By.xpath("//h5/following::span[contains(text(),'Age is mandatory')]")).getText();
		System.out.println(text1);	
		driver.navigate().back();
		 Point location1 = driver.findElement(By.xpath("//label[text()='Username']")).getLocation();
		 System.out.println(location1);
		 driver.findElement(By.xpath("(//h5[text()='Click and Confirm Label Position Changes']/following::input)[1]")).click();
		 Point location2 = driver.findElement(By.xpath("//label[text()='Username']")).getLocation();
		 System.out.println(location2);
		 if(location1.equals(location2)){
			 System.out.println("Label Position not changed" +location1);
		 }
		 else {
			 System.out.println("Label Position  changed" +location1+ " " +location2);
		 }
		 driver.findElement(By.xpath("(//h5[text()='Type your name and choose the third option']/following::input)[1]")).click();
		 driver.findElement(By.xpath("(//h5[text()='Type your name and choose the third option']/following::input)[1]")).sendKeys("Hema");
		 driver.findElement(By.xpath("(//span[@id='j_idt106:auto-complete_panel']//li)[3]")).click();
		 driver.findElement(By.xpath("(//h5[text()='Type your DOB (mm/dd/yyyy) and confirm date chosen ']/following::input)[1]")).sendKeys("12/4/1993");
		 System.out.println(driver.findElement(By.xpath("(//h5[text()='Type your DOB (mm/dd/yyyy) and confirm date chosen ']/following::input)[1]")).getAttribute("value"));
		 String dob = driver.findElement(By.xpath("(//h5[text()='Type your DOB (mm/dd/yyyy) and confirm date chosen ']/following::input)[1]")).getAttribute("value");
		 String date = driver.findElement(By.linkText("4")).getText();
		 System.out.println(date);
		 if(dob.contains(date))
		 System.out.println("Entered dob is confirmed");
		 else
			 System.out.println("Entered dob is not correct");
		 
		 driver.findElement(By.xpath("(//h5[text()='Type number and spin to confirm value changed']/following::input)[1]")).sendKeys("5");
		 System.out.println(driver.findElement(By.xpath("(//h5[text()='Type number and spin to confirm value changed']/following::input)[1]")).getAttribute("value"));
		 String num1=driver.findElement(By.xpath("(//h5[text()='Type number and spin to confirm value changed']/following::input)[1]")).getAttribute("value");
		 driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-s']")).click();
		 System.out.println(driver.findElement(By.xpath("(//h5[text()='Type number and spin to confirm value changed']/following::input)[1]")).getAttribute("value"));
		 String num2=driver.findElement(By.xpath("(//h5[text()='Type number and spin to confirm value changed']/following::input)[1]")).getAttribute("value");
		 if(num1==num2) {
			 System.out.println("Value not changed");
		 }else {
			 System.out.println("Value is changed");
		 }
		
		 driver.findElement(By.xpath("(//h5[contains(text(),'Type random number (1-100)')]/following::input)[1]")).sendKeys("50");
		 String range =driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle ui-corner-all ')]")).getAttribute("style");
		
		 if(range.contains("50")) {
			 System.out.println("Slider range is correct");
		 }
		 else {
			 System.out.println("Slider range is not correct");
		 }
		  driver.findElement(By.xpath("(//h5[text()='Click and Confirm Keyboard appears']/following::input)[1]")).click();
		 boolean keyboard = driver.findElement(By.xpath("//div[@class='ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay']")).isDisplayed();
		 System.out.println(keyboard);
		 if(keyboard==true)
			 System.out.println("Keyboard is displayed");
		 else
			 System.out.println("Keyboard is not displayed"); 
		
		driver.findElement(By.xpath("(//button[@class='ql-italic'])[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"j_idt106:j_idt124_editor\"]/div[1]")).sendKeys("Learning Automation using Java");
		 
	}

}
