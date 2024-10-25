package module;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Test");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
       JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
			//Element Button
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]")).click();	
			Thread.sleep(1000);
			//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[3]/div/ul/li[1]")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[3]/div/ul/li[2]")).click();

			
			
					driver.findElement(By.id("alertButton")).click();
			
			
			Alert a1=driver.switchTo().alert();
			System.out.println(a1.getText());
			
//			a1.dismiss();
			Thread.sleep(2000);
			a1.accept();
			
			Thread.sleep(1000);
			//JavascriptExecutor js = (JavascriptExecutor) driver;
//			//Locating element by link text and store in variable "Element"        
			        WebElement Element = driver.findElement(By.id("confirmButton"));
	//
//			        // Scrolling down the page till the element is found
			        js.executeScript("arguments[0].scrollIntoView();", Element);
			        driver.findElement(By.id("confirmButton")).click();
					Alert a3=driver.switchTo().alert();
					System.out.println();
					System.out.println(a3.getText());
					
//					a3.dismiss();
					Thread.sleep(3000);
					a3.accept();
					System.out.println(driver.findElement(By.id("confirmResult")).getText());
					
					
					Thread.sleep(1000);
					//JavascriptExecutor js = (JavascriptExecutor) driver;
//					//Locating element by link text and store in variable "Element"        
					        WebElement Element1 = driver.findElement(By.id("promtButton"));
			//
//					        // Scrolling down the page till the element is found
					        js.executeScript("arguments[0].scrollIntoView();", Element1);
					
					        
					        
					driver.findElement(By.id("promtButton")).click();
					//Alert palert=driver.switchTo().alert();
					Alert palert=driver.switchTo().alert();//sendKeys("123");
					Thread.sleep(2000);
					System.out.println();
					System.out.println(palert.getText());
					palert.sendKeys("Test User");
//					palert.dismiss();
					Thread.sleep(4000);
					palert.accept();
					System.out.println(driver.findElement(By.id("promptResult")).getText());
					Thread.sleep(3000);
					driver.close();
		
	}
}
