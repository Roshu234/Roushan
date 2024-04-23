package seleniumdemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kocro\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(2000);
driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("admin123");
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//a[@href='/web/index.php/buzz/viewBuzz']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//textarea[@class='oxd-buzz-post-input']")).sendKeys("Roushan kumar");
driver.findElement(By.xpath("//button[@type='submit']")).click();


	}

}