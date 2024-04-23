package seleniumdemo1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class orangeHRM1 {

	public static void main(String[] args) throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kocro\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		loginfunctionality d = new loginfunctionality();
		Thread.sleep(4000);
		d.login_navigate();
	
				
		

		Thread.sleep(3000);
		d.buzz();
		
		

	}

}