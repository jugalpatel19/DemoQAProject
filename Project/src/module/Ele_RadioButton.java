package module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ele_RadioButton {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("label[for='yesRadio']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("label[for='impressiveRadio']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("label[for='noRadio']")).click();
//		Thread.sleep(2000); button not click able
		
		driver.close();
	}

}
