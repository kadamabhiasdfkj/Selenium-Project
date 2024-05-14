package Jason.com;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileUpload {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.id("uploadfile")).sendKeys("\\C:\\Users\\asus\\Downloads\\Selenium interview Q & A.pdf\\");
		
		
		
		

	}

}




/*
 * driver.findElement(By.linkText("File Upload")).click();
		
		WebElement file=driver.findElement(By.id("file-upload"));
		file.click();
		
		File fi=new File("C:/Users/asus/Downloads/Selenium interview Q & A.pdf/");
		
		file.sendKeys(fi.getAbsolutePath());
		
		driver.findElement(By.id("file-submit")).click();
		*/
