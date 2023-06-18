package week2.week2assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeafGround2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		if(title.contains("Dashboard")) {
			System.out.println("Title is matched");
		}
        driver.navigate().back();
        
        boolean btn = driver.findElement(By.xpath("(//h5[text()='Confirm if the button is disabled.']/following::button)[1]")).isEnabled();
       
        if(btn==false) {
        	System.out.println("Button is disabled");
        }else
        	System.out.println("Button is enabled");
        System.out.println(driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation());
        System.out.println(driver.findElement(By.xpath("(//h5[text()='Find the Save button color']/following::button)[1]")).getCssValue("background-color"));
        System.out.println(driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize());
        System.out.println("Before mouse over :"+driver.findElement(By.xpath("(//h5[text()='Mouse over and confirm the color changed']/following::button)[1]")).getCssValue("background-color"));
        Actions actions = new Actions(driver);
	    actions.moveToElement(driver.findElement(By.xpath("(//h5[text()='Mouse over and confirm the color changed']/following::button)[1]"))).build().perform();
	    Thread.sleep(1000);
	    System.out.println("After mouse over :"+driver.findElement(By.xpath("(//h5[text()='Mouse over and confirm the color changed']/following::button)[1]")).getCssValue("background-color"));
	    driver.findElement(By.xpath("//span[text()='Image']")).click();
	    Actions act = new Actions(driver);
	    WebElement image = driver.findElement(By.xpath("//div[@class='ui-overlaypanel-content']/img"));
	    act.moveToElement(image).click(image).perform();
	    
	    List<WebElement> roundBtn = driver
				.findElements(By.xpath("//h5[text()='How many rounded buttons are there?']/following::button"));
	    System.out.println("No.of rounded buttons "+roundBtn.size());
	}

}
