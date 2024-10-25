package module;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class WebTable {
	
	WebDriver driver;
	@BeforeClass
	public void before() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
        WebElement elementToScrollTo = driver.findElement(By.id("addNewRecordButton"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);",elementToScrollTo);
		Thread.sleep(2000);
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.id("addNewRecordButton")).click();
		Thread.sleep(2000);
	}
}


