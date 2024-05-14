package framework;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeSuite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class ExecutionDrvier1 {

	public void init() {
	}

	public void close() {
	}

	public WebDriver driver = null;

	

	@BeforeSuite
	public void beforeSuite() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.calculator.net/");
		init();
	}

	@AfterSuite
	public void afterSuite() {
		close();
		//driver.close();
	}

}
