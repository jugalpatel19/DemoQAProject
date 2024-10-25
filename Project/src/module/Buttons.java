package module;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Buttons {
	
	WebDriver driver;
	@Test
	public void click() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/buttons");
	
    WebElement elementToScrollTo = driver.findElement(By.id("doubleClickBtn"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",elementToScrollTo);
	Thread.sleep(2000);
	
	WebElement clic=driver.findElement(By.id("doubleClickBtn"));
	Actions clicactions=new Actions(driver);
	clicactions.moveToElement(clic).doubleClick().build().perform();
	Thread.sleep(2000);
	
	WebElement conclic=driver.findElement(By.id("rightClickBtn"));
	Actions conclicactions=new Actions(driver);
	conclicactions.moveToElement(conclic).contextClick().build().perform();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[text()='Click Me']")).click();
	Thread.sleep(2000);
	
	driver.close();
	}


}
