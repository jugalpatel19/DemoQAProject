package module;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ModalDialogs {
	
	@Test
	public void Modal() throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/modal-dialogs");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	WebElement elementToScrollTo = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/h1"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",elementToScrollTo);
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@id='showSmallModal']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("closeSmallModal")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("showLargeModal")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("closeLargeModal")).click();
	Thread.sleep(2000);
	
	
	driver.close();
	}

}
