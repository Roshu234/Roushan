package seleniumdemo1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kocro\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;//scroll down window
		js.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		a.accept();
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(6000);
		Alert b = driver.switchTo().alert();
		b.accept();
		driver.findElement(By.id("confirmButton")).click();
		Alert c = driver.switchTo().alert();
		c.dismiss();
		driver.findElement(By.id("promtButton")).click();
		Alert d = driver.switchTo().alert();
		d.sendKeys("roushan kumar");
		d.accept();
		}
		
}


