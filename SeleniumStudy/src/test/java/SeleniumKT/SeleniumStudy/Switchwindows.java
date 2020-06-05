package SeleniumKT.SeleniumStudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchwindows {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"//Users//deepaksrivastava//eclipse-workspace//SeleniumStudy//Drivers//chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String URL = "https://demoqa.com/automation-practice-switch-windows/";
		driver.get(URL);
		
		driver.findElement(By.id("button1")).click();
		//driver.getWindowHandle().

	}

}
