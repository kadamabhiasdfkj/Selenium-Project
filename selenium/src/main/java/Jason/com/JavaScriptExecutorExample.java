package Jason.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorExample {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    
	     WebDriver driver=new ChromeDriver();
	     
	     driver.manage().window().maximize();
	     
	     driver.get("https://the-internet.herokuapp.com/");
	     
	     
	     //click()
	     WebElement element5=driver.findElement(By.xpath("//span[text()='5']"));
	     
	     

	}

}
