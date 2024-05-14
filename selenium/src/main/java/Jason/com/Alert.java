package Jason.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	private static final Object Timethread = null;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromiumdriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		
		
		
		WebElement alertMenu=driver.findElement(By.xpath("//a[text()='JavaScript Alerts']"));
		alertMenu.click();
		
		WebElement openAlert=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		openAlert.click();
		
		driver.switchTo().alert().accept();
		
		
		WebElement dismissButton=driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		dismissButton.click();
		
		driver.switchTo().alert().dismiss();
		
		WebElement sendkeysAlert=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		sendkeysAlert.click();
	
		driver.switchTo().alert().sendKeys("Asif Shekh");
		driver.switchTo().alert().accept();
		
		
		System.out.println(driver.findElement(By.id("result")).getText());
		

	}

}
