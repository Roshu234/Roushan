package seleniumdemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class uncodmey {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kocro\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://uncodemy.com/");
		Thread.sleep(2000);
	WebElement st = driver.findElement(By.xpath("//span[@id='categoriesBtn']"));
		Actions a = new Actions(driver);
		a.moveToElement(st).perform();
		Thread.sleep(3000);
		WebElement stt = driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Software Testing']"));
		Actions act = new Actions(driver);
		a.moveToElement(stt).perform();
	}

}
