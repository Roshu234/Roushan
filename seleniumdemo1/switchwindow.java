package seleniumdemo1;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchwindow {

	public static void main(String[] args)throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kocro\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	//	Thread.sleep(5000);
		driver.manage().window().maximize();
		String parentWinid = driver.getWindowHandle();
		System.out.println("parent window id is ="+ parentWinid);
		WebElement insta = driver.findElement(By.xpath("//a[@title='Take a look at Instagram']"));
		insta.click();
		Set<String> allWindoid = driver.getWindowHandles();
		System.out.println("main window ID is"+ allWindoid);
		for(String wn: allWindoid) {
			if(!parentWinid.equals(wn));{
				driver.switchTo().window(wn);
			}
		}
		
		

	}

}
