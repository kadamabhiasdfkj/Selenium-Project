package Jason.com;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultipleDowns {

	private static final WebElement WebElement = null;

	static WebDriver driver;
	
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
	    driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement drpvalue=driver.findElement(By.id("withOptGroup"));
		SelectoptionDrop(drpvalue,"Group 2, option 1");
		
		WebElement drpone=driver.findElement(By.id("selectOne"));
		SelectoptionDrop(drpone,"Ms.");
				
		WebElement drpmenu=driver.findElement(By.id("oldSelectMenu"));
		SelectoptionDrop(drpmenu,"Yellow");
	}
		
		public static void SelectoptionDrop(WebElement ele,String choose)
		{
			
			Select drp=new Select(ele);
			
			List<WebElement> getvalues=drp.getOptions();
			
			for(WebElement option:getvalues) {
				
				System.out.println(option.getText());
				
				if(option.getText().equals(choose)) {
					
					option.click();
					break;
				}
				
			}
			
			
		}
		
		



}
