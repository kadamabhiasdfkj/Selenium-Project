package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import businessLib.Operations;
import framework.ExecutionDrvier1;

public class DivideTest extends ExecutionDrvier1 {
	
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
		String actualResult = operation.divide(6,2);
		if (actualResult.equals(" 3")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}

	@Test (priority = 2)
	public void negativeTest() {
		String actualResult = operation.divide(6,-2);
		if (actualResult.equals(" -3")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}
	
	@Test (priority = 3)
	public void decimalTest() {
		String actualResult = operation.divide(45.6,2);
		if (actualResult.equals(" 22.8")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}
	
	@Test (priority = 4)
	public void positiveNegativeTest() {
		String actualResult = operation.divide(-16,2);
		if (actualResult.equals(" -8")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}
	
	@Test (priority = 5)
	public void negativeDecimalTest() {
		String actualResult = operation.divide(-10.6,2);
		if (actualResult.equals(" -5.3")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}

}
