package SeleniumKT.SeleniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"//Users//deepaksrivastava//eclipse-workspace//SeleniumStudy//Drivers//chromedriver");

		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		driver.get(baseUrl);
		// // WebElement link_Home = driver.findElement(By.linkText("Home"));
		//
		// // WebElement td_Home = driver.findElement(By
		// .xpath("//html/body/div"
		// + "/table/tbody/tr/td"
		// + "/table/tbody/tr/td"
		// + "/table/tbody/tr/td"
		// + "/table/tbody/tr"));

		// Actions action=new Actions(driver);

		// Actions action = new Actions(driver);
		// Action mouseOverHome = action.
		//
		//
		// .moveToElement(link_Home)
		// .build();
		//
		// String bgColor = td_Home.getCssValue("background-color");
		// System.out.println("Before hover: " + bgColor);
		// mouseOverHome.perform();
		// bgColor = td_Home.getCssValue("background-color");
		// System.out.println("After hover: " + bgColor);
		// driver.close();

	}

}
