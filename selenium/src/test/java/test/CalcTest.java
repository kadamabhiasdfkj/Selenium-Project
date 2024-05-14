package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Jason.com.ExecutionDriver;
import businessLib.Operations;
import framework.ExecutionDrvier1;

public class CalcTest extends ExecutionDrvier1 {

	Operations operation;

	@Override
	public void init() {

		operation = new Operations(driver);
	}

	@Override

	public void close() {

		operation = null;
	}

	@Test (priority = 1)
	public void positiveTest() {
		String actualResult = operation.add(15,25);
		if (actualResult.equals(" 40")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}

	@Test (priority = 2)
	public void negativeTest() {
		String actualResult = operation.add(-15, -25);
		if (actualResult.equals(" -40")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}
	
	@Test (priority = 3)
	public void decimalTest() {
		String actualResult = operation.add(5.5, 7.5);
		if (actualResult.equals(" 13")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}
	
	@Test (priority = 4)
	public void positiveNegativeTest() {
		String actualResult = operation.add(-5, 10);
		if (actualResult.equals(" 5")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}
	
	@Test (priority = 5)
	public void negativeDecimalTest() {
		String actualResult = operation.add(-25, 10.5);
		if (actualResult.equals(" -14.5")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}
}

