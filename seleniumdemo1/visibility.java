package seleniumdemo1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class visibility {

	public static void main(String[] args)throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kocro\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
    boolean  a;
    WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
    a = loginbtn.isDisplayed();
    
	if(a==true) {
    
    System.out.println(a);
    Thread.sleep(3000);
    driver.quit();
	}
	}
}
