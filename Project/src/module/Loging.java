package module;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loging {

	WebDriver driver;
	@BeforeTest
	public void before() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/login");
        WebElement elementToScrollTo = driver.findElement(By.id("userForm"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);",elementToScrollTo);
		Thread.sleep(2000);
	}
	
	@Test
	public void user() throws InterruptedException {
		driver.findElement(By.id("userName")).sendKeys("topstechnologies");
		Thread.sleep(2000);
	}
	@Test
	public void password() throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys("tops@123");
		Thread.sleep(2000);
	}
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void after() throws InterruptedException {
		driver.close();
		Thread.sleep(2000);
	}

}
