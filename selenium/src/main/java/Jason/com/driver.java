package Jason.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driver {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		// maximize the browser
		
		driver.manage().window().maximize();
		
		// open the URL
		
		driver.get("https://wwww.calculator.net"); 
		
		// locate element using ID locator
//		
//	    WebElement serchbox=driver.findElement(By.id("calcSearchTerm"));
//		serchbox.sendKeys("This is"); 
//		
//		
//		locate element using name locator
//		
//		serchbox=driver.findElement(By.name("calcSearchTerm"));
//		serchbox.sendKeys("Selenium");
//		
		
	  
//	  WebElement add=driver.findElement(By.xpath("//span[@onclick='r(5)']"));
//	  add.click();
//	
//	  driver.findElement(By.xpath("//span[contains(text(),'+')]")).click();
//	  
//	  add.click();
//	  
//	  WebElement isEqual=driver.findElement(By.xpath("//span[contains(text(),'=')]"));
//	  isEqual.click();
//	  
//	WebElement Result=driver.findElement(By.id("sciOutPut"));
//	String text = Result.getText();
//	
//	if(text.equals(" 10")) {
//		System.out.println("Test Case Pass");
//	}
//	else {
//		System.out.println("Test Case Fail");
//	}
//	  
//	  WebElement back=driver.findElement(By.xpath("//span[contains(text(),'Back')]"));
//	  back.click();
//	  
//	  ////////////////////////////////////////////////////////////////////////////
//	  
//	  WebElement sub=driver.findElement(By.xpath("//span[@onclick='r(9)']"));
//	  sub.click();
//		
//	  sub=driver.findElement(By.xpath("//span[contains(text(),'–')]"));
//	  sub.click();
//	  
//	  sub = driver.findElement(By.xpath("//span[@onclick='r(5)']"));
//	  sub.click();
//	  
//	  isEqual.click();
//	  
//	  String subtractionresult = Result.getText();
//	  
//		if(subtractionresult.equals(" 4")) {
//			System.out.println("Test Case Pass");
//		}
//		else {
//			System.out.println("Test Case Fail");
//		}
//	  
//	  
//	   back.click();
//	   
//	   ////////////////////////////////////////////////////////////////////
//	   
//	   WebElement multi=driver.findElement(By.xpath("//span[@onclick='r(7)']"));
//	   multi.click();
//	   multi=driver.findElement(By.xpath("//span[contains(text(),'×')]"));
//	   multi.click();
//	   multi=driver.findElement(By.xpath("//span[@onclick='r(6)']"));
//	   multi.click();
//	   isEqual.click();
//	  
//	   String multiplicationresult = Result.getText();
//		  
//			if(multiplicationresult.equals(" 42")) {
//				System.out.println("Test Case Pass");
//			}
//			else {
//				System.out.println("Test Case Fail");
//			}
//	  
//	   
//		back.click();
//		
//		
//	   //////////////////////////////////////////////////////////////////////////////
//		
//		
//		
//	   WebElement division=driver.findElement(By.xpath("//span[@onclick='r(8)']"));
//	   division.click();
//	   
//	   division=driver.findElement(By.xpath("//span[text()='/']"));
//	   division.click();
//	   division=driver.findElement(By.xpath("//span[@onclick='r(2)']"));
//	   division.click();
//	   isEqual.click();
//	   
//
//		  String divisionresult = Result.getText();
//		  
//			if(divisionresult.equals(" 4")) {
//				System.out.println("Test Case Pass");
//			}
//			else {
//				System.out.println("Test Case Fail");
//			}
//	  
//			 back.click();
		
		List<WebElement> fitness=driver.findElements(By.xpath("//*[@id='hl2']//a"));
		
		for(WebElement getelemensts : fitness ) {
			
			System.out.println(getelemensts.getText());
			
		}
		
		System.out.println("--------------------------------------------------------------------------");
		
		
		List<WebElement> financial=driver.findElements(By.xpath("//*[@id='hl1']//a"));
		
		for(WebElement finance:financial) {
			
		System.out.println(finance.getText());
			
		}
		
System.out.println("--------------------------------------------------------------------------");
		
		
		List<WebElement> matha=driver.findElements(By.xpath("//*[@id='hl3']//a"));
		
		for(WebElement mathcalcu:matha) {
			
		System.out.println(mathcalcu.getText());
			
		}
		
System.out.println("--------------------------------------------------------------------------");
		
		
		List<WebElement> othercal=driver.findElements(By.xpath("//*[@id='hl5']//a"));
		
		for(WebElement othcalcu:othercal) {
			
		System.out.println(othcalcu.getText());
			
		}
		
	}

	public static Object manage() {
		// TODO Auto-generated method stub
		return null;
	}

}


