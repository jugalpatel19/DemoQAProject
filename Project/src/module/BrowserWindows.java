package module;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserWindows {
	@Test
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		
JavascriptExecutor js= (JavascriptExecutor) driver;
		
		WebElement element=driver.findElement(By.xpath("////*[@id=\"browserWindows\"]/h1"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		
		driver.findElement(By.cssSelector("button[id='tabButton']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
	
		driver.findElement(By.cssSelector("button[id='windowButton']")).click();		
		Thread.sleep(5000);
		driver.navigate().back();
		
		driver.findElement(By.cssSelector("button[id='messageWindowButton']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		
		driver.quit();
	}

}
