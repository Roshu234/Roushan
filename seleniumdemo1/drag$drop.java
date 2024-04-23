package seleniumdemo1;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag$drop {

	public static void main(String[] args)throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kocro\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
	//	Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
	//	Actions action = new Actions(driver);
		WebElement item = driver.findElement(By.xpath("//li[1]"));
	    WebElement trash =	driver.findElement(By.xpath("//div[@id='trash']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(item,trash).perform();
		
		
	}

}
