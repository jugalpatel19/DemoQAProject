package module;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class AlertsClick {
	
WebDriver driver;
	
	@Test
	public void alertsevent() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		Alert a1 = driver.switchTo().alert();
		System.out.println("alert message : "+a1.getText());
		Thread.sleep(2000);
		a1.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(2000);
		Alert a2 = driver.switchTo().alert();
		System.out.println("time alert message : "+a2.getText());
		Thread.sleep(2000);
		a2.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		Alert a3 = driver.switchTo().alert();	
		System.out.println("Alert Message : "+a3.getText());
		Thread.sleep(2000);
		a3.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(2000);
		Alert a4 = driver.switchTo().alert();	
		System.out.println("Alert Message : "+a4.getText());
		a4.sendKeys("Ajay");
		Thread.sleep(2000);
		
		driver.close();
	}


}
