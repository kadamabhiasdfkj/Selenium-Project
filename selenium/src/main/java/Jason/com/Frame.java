package Jason.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Frames")).click();
		driver.findElement(By.linkText("Nested Frames")).click();
		
		WebElement topframe=driver.findElement(By.name("frame-top"));
		
		driver.switchTo().frame(topframe);
		System.out.println(driver.getPageSource());
		
		
		
		
		
		try {
			
			
			
			WebElement bottomFrame=driver.findElement(By.name("frame-bottom"));
			
			driver.switchTo().frame(bottomFrame);
			
			System.out.println("--------------------Printing HTML for bottom frame-------------");
			System.out.println(driver.getPageSource());
		}catch(Exception e) {
			
			System.out.println("No bottom frame found");			
		}
		driver.switchTo().defaultContent();
		
		try {
			
     WebElement bottomFrame=driver.findElement(By.name("frame-bottom"));
			
			driver.switchTo().frame(bottomFrame);
			
			
			System.out.println("--------------------Printing HTML for bottom frame-------------");
			System.out.println(driver.getPageSource());
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
