package seleniumdemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kocro\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		 driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("shirt");
		 driver.findElement(By.xpath("//button[@type='submit']//*[name()='svg']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.id("SHTG5TWVY4RSZYRT")).click();
		
	}

}
