package SeleniumKT.SeleniumStudy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchframes {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"//Users//deepaksrivastava//eclipse-workspace//SeleniumStudy//Drivers//chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String URL = "https://demoqa.com/iframe-practice-page";
		driver.get(URL);
		
	List <WebElement> frames=driver.findElements(By.tagName("iframe"));
	
	int frameCount=frames.size();
	//driver.switchTo().frame("iframe1");
	driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/ul/li[1]/a/span/span")).click();
	
	System.out.println(frameCount);
	
		////*[@id="primary-menu"]/li[2]/ul/li[1]/a/span/span
	}

}
