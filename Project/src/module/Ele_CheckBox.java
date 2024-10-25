package module;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Ele_CheckBox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		

		
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("label[for='tree-node-home']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("label[for='tree-node-desktop']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("label[for='tree-node-notes']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("label[for='tree-node-commands']")).click();
		Thread.sleep(5000);
		

		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("label[for='tree-node-documents']")).click();
		Thread.sleep(5000);
		

//		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector("label[for='tree-node-workspace']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector("label[for='tree-node-react']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector("label[for='tree-node-angular']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector("label[for='tree-node-ven']")).click();
//		Thread.sleep(5000);
		

//		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector("label[for='tree-node-office']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector("label[for='tree-node-public']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector("label[for='tree-node-private']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector("label[for='tree-node-classified']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector("label[for='tree-node-general']")).click();
//		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("label[for='tree-node-downloads']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("label[for='tree-node-wordFile']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("label[for='tree-node-excelFile']")).click();
		Thread.sleep(5000);
		
		driver.close();
		}
	}

