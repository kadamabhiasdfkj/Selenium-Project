package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import businessLib.Operations;
import framework.ExecutionDrvier1;

public class MultiplyTest extends ExecutionDrvier1 {
	
	
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
		String actualResult = operation.multi(15,25);
		if (actualResult.equals(" 375")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}

	@Test (priority = 2)
	public void negativeTest() {
		String actualResult = operation.multi(-8,-7);
		if (actualResult.equals(" 56")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}
	
	@Test (priority = 3)
	public void decimalTest() {
		String actualResult = operation.multi(1.3, 6);
		if (actualResult.equals(" -7.8")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}
	
	@Test (priority = 4)
	public void positiveNegativeTest() {
		String actualResult = operation.multi(-15, 6);
		if (actualResult.equals(" -90")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}
	
	@Test (priority = 5)
	public void negativeDecimalTest() {
		String actualResult = operation.multi(-15.2, 6);
		if (actualResult.equals(" -91.2")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}

}
