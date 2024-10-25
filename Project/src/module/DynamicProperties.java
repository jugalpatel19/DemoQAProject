package module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DynamicProperties {
	
WebDriver driver;
	
	@Test
	public void dynamic() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dynamic-properties");
		

		WebDriverWait wait=new WebDriverWait(driver, 40);
//		String msg1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.mt-4.text-danger.btn.btn-primary");
//		System.out.println("Button color changed to "+msg1);
		String msg=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Visible After 5 Seconds']"))).getText();
		System.out.println("text "+msg);
	}

}
