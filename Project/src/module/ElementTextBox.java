package module;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ElementTextBox {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Tops tech");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("tops@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("301, Jeevandeep Complex, Ring Rd, beside Nirmal Hospital, Jeevandeep Society, Sagrampura, Surat, Gujarat 395002");
		Thread.sleep(2000);
		
		WebElement address=driver.findElement(By.id("currentAddress"));
		WebElement peradd=driver.findElement(By.id("permanentAddress"));
		
		Actions actions=new Actions(driver); 
		
		
		Action a1=actions.moveToElement(address).click().sendKeys("301, Jeevandeep Complex, Ring Rd,"
				+ " beside Nirmal Hospital, Jeevandeep Society, "
				+ "Sagrampura, Surat, Gujarat 395002").keyDown(address, Keys.CONTROL).sendKeys(address, "ac")
				.keyUp(address, Keys.CONTROL).build();
		a1.perform();
		Thread.sleep(2000);
		
		Action a2=actions.moveToElement(peradd).keyDown(peradd, Keys.CONTROL).sendKeys(peradd ,"v")
				.keyUp(peradd, Keys.CONTROL).build();
		a2.perform();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
