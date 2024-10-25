package module;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Links {
	
WebDriver driver;
	
	@Test
	public void LinksOption() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/links");
		Thread.sleep(2000);
		
		
		String main_window= driver.getWindowHandle();
		System.out.println("main window :"+main_window);
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(5000);
		
		Set<String> all_window= driver.getWindowHandles();
		Iterator<String> i1=all_window.iterator();
		while (i1.hasNext()) {
			String child_window = (String) i1.next();
			System.out.println("child window :"+child_window);
			if(!main_window.equals(child_window)) {
				driver.switchTo().window(child_window);
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(main_window);
		
		String main_window1= driver.getWindowHandle();
		System.out.println("main window :"+main_window1);
		driver.findElement(By.cssSelector("a[id='dynamicLink']")).click();		
		Thread.sleep(5000);
		Set<String> all_window1= driver.getWindowHandles();
		Iterator<String> i2=all_window1.iterator();
		while (i2.hasNext()) {
			String child_window1 = (String) i2.next();
			System.out.println("child window :"+child_window1);
			if(!main_window1.equals(child_window1)) {
				driver.switchTo().window(child_window1);
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(main_window1);
		driver.findElement(By.cssSelector("a[id='created']")).click();	
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='no-content']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='moved']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='bad-request']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='unauthorized']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='forbidden']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='invalid-url']")).click();
		Thread.sleep(2000);
	}

}
