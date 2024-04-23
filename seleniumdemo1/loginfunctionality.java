package seleniumdemo1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginfunctionality {
	WebDriver driver = new ChromeDriver();
	void login_navigate()throws InterruptedException, IOException{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Thread.sleep(5000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File targ = new File ("C:\\Users\\kocro\\Downloads\\sample\\orangehrmscreenshot.jpg");
        FileUtils.copyFile(src, targ);
		//driver.quit();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
void buzz()throws InterruptedException, IOException{
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File targ = new File ("C:\\Users\\kocro\\Downloads\\sample\\orangehrmscreenshot.jpg");
    FileUtils.copyFile(src, targ);
    Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@href='/web/index.php/buzz/viewBuzz']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//textarea[@class='oxd-buzz-post-input']")).sendKeys("Roushan kumar");
	driver.findElement(By.xpath("//button[@type='submit']")).click();

}
}
