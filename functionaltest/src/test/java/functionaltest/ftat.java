package functionaltest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ftat {
	
	public HtmlUnitDriver driver;
	//public WebDriver driver;
	public WebDriverWait wait;
	public String URL = "http://172.31.8.75:8080/QAWebapp/";


	@Test(priority = 0)
	public void logintest()  {
		driver = new HtmlUnitDriver();
		//driver= new FirefoxDriver();
		wait = new WebDriverWait(driver, 10);
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//h1[text()='Hello DevOps Engineers and Architects']")).isDisplayed();

	}


}
