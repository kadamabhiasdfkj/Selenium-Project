package Jason.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Screenshot {

	public static void main(String[] args) throws IOException {

    WebDriverManager.chromedriver().setup();
    
     WebDriver driver=new ChromeDriver();
     
     driver.manage().window().maximize();
     
     driver.get("https://the-internet.herokuapp.com/");
    
		
     TakesScreenshot screenshot= (TakesScreenshot) driver;
     File file1=screenshot.getScreenshotAs(OutputType.FILE);
     FileUtils.copyFile(file1, new File("screen1.jpg"));
     
     
     

	}

}
