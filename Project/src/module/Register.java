package module;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Register {
	
WebDriver driver;
	
	@BeforeClass
	public void before() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/register");
		WebElement elementToScrollTo = driver.findElement(By.id("userForm"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);",elementToScrollTo);	
		Thread.sleep(2000);
	}
	
	@Test
	public void firstname() throws InterruptedException {
		driver.findElement(By.id("firstname")).sendKeys("tops");
		Thread.sleep(2000);
	}
	@Test
	public void lastname() throws InterruptedException {
		driver.findElement(By.id("lastname")).sendKeys("technologies");
		Thread.sleep(2000);
	}
	@Test
	public void username() throws InterruptedException {
		driver.findElement(By.id("userName")).sendKeys("topstechnologies");
		Thread.sleep(2000);
	}
	@Test
	public void password() throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys("tops@123");
		Thread.sleep(2000);
	}
	@Test
	public void click() throws InterruptedException {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
	}
	@Test
	public void register() throws InterruptedException {
		driver.findElement(By.id("register")).click();
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void after() throws InterruptedException {
		driver.close();
		Thread.sleep(2000);
		
	}

}
