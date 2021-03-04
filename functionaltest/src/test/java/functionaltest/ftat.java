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


	@Test(priority = 0)
	public void viewrepairticket() throws Exception {
		WebElement welcome = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//h1[text()='Hello DevOps Engineers and Architects']")));
		welcome.isDisplayed();

	}


}
