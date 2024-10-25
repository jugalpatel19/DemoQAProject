package module;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class BrokenLinksImages {
	
WebDriver driver;
	
	@Test
	public void broken() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/broken");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/h1"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		
		driver.findElement(By.xpath("//a[text()='Click Here for Valid Link']")).click();		
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Click Here for Broken Link']")).click();		
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.close();
	}

}
