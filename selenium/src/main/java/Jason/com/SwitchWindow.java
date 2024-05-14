package Jason.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindow {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		
		System.out.println("Current Window:- " + driver.getTitle());
		
		String mainWindow=driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		System.out.println("Current Window:- "+ driver.getTitle());
		
		String secondWindow=driver.getWindowHandle();
		
		driver.get("https://www.facebook.com");
		
		System.out.println("Current Window:- "+ driver.getTitle());
		
		driver.switchTo().window(mainWindow);
		
		System.out.println("Current Window:- "+ driver.getTitle());
		
     
	}

}
