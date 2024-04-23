package seleniumdemo1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {

	public static void main(String[] args)throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kocro\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@role=\"searchbox\"]")).sendKeys("sasaram");
		driver.findElement(By.xpath("//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("new delhi");
	   WebElement datepicker = driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']"));
	   datepicker.click();
	   String expectedday = "27";
	   String expectedemonth = "april";
	   String expectedyear = "2024";
	   driver.switchTo().frame(0);
	   while(true)
	   {
	String calendarmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']")).getText();
	String calendaryear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year ng-tns-c58-10 ng-star-inserted']")).getText();
	if(calendarmonth.equals(expectedemonth)&&(calendaryear.equals(calendaryear)));
	driver.findElement(By.xpath("//a[normalize-space()='27']")).click();
	break;
	   }
	   
	
		//driver.findElement(By.xpath("//div[@class='tbis-div']//div[1]//div[1]//app-train-avl-enq[1]//div[1]//div[5]//div[1]//table[1]//tr[1]//td[1]//div[1]//div[2]"));

	}

}
