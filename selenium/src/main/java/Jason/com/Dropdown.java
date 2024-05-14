package Jason.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement dropcolor=driver.findElement(By.id("oldSelectMenu"));
		
		
		Select dropdown= new Select(dropcolor);
		
		
		// Select the text from dropdown using by - selectByVisibleText() method.
		
		dropdown.selectByVisibleText("Black");
		
		WebElement firstvalue=dropdown.getFirstSelectedOption();
		
		System.out.println(firstvalue.getText());
	
		
		// Select the text from dropdown using by - selectByvalue() method.
		
		
	    dropdown.selectByValue("10");
	    
	    WebElement secondvalue=dropdown.getFirstSelectedOption();
		
		System.out.println(secondvalue.getText());

		
	// Select the text from dropdown using by - selectByIndex() method.
		
		
	    dropdown.selectByIndex(6);
	    
	    WebElement thirdvalue=dropdown.getFirstSelectedOption();
		
		System.out.println(thirdvalue.getText());
		
		
		System.out.println("---------------------------------------------------------------");
		
	// get all the options using by getOptions() method.
		
	List<WebElement> getallvalue= dropdown.getOptions();
	
	for(WebElement val:getallvalue) {
		
		System.out.println(val.getText());
		
	}
	
	for(WebElement vals:getallvalue) {
		
		
		if(vals.getText().equals("Voilet")) {
			vals.click();
			break;
		}
		
	}

		
	
		
	}

}
