package week2.week2assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround5 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//label[text()='Chrome']/preceding-sibling::div)[1]")).click();
		List<WebElement> unselectable = driver.findElements(By.xpath("//div[@id='j_idt87:city2']//div[2]/span[contains(@class,'ui-radiobutton-icon ui-icon')]"));
		for (int i = 0; i < unselectable.size(); i++) {
			
			if(unselectable.get(i).getAttribute("class").contains("bullet")) {
				String text = driver.findElement(By.xpath("//div[@id='j_idt87:city2']//div[2]/label")).getText();
				System.out.println("The selected city is : " + text);
			}else {
				String text = driver.findElement(By.xpath("(//div[@id='j_idt87:city2']//div/label)["+(i+1)+"]")).getText();
				System.out.println("Not Selected City:"+text);
			}
		}
		driver.findElement(By.xpath("//label[text()='Chennai']/preceding-sibling::div")).click();
		List<WebElement> defaultButton = driver.findElements(By.xpath("//h5[text()='Find the default select radio button']/following::td//span[contains(@class,'ui-radiobutton-icon ui-icon')]"));
		for (int i = 0; i < defaultButton.size(); i++) {
			
			if(defaultButton.get(i).getAttribute("class").contains("bullet")) {
				String text = driver.findElement(By.xpath("//h5[text()='Find the default select radio button']/following::td["+(i+1)+"]//label")).getText();
				System.out.println("The default browser is : " + text);
			}
		/*	else {
				System.out.println(driver.findElement(By.xpath("//h5[text()='Find the default select radio button']/following::td["+(i+1)+"]//label")).getText());
			}*/

		}
		List<WebElement> age = driver.findElements(By.xpath("//div[@id='j_idt87:age']//div[2]/span"));
		for (int i = 0; i < age.size(); i++) {
			System.out.println(age.get(i).getAttribute("class"));
			if(age.get(i).getAttribute("class").contains("bullet")) {
				
				System.out.println("Already age group selected");
				
			}
			else {
				age.get(i).click();
			}
	}

}
}
