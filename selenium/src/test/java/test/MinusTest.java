package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import businessLib.Operations;
import framework.ExecutionDrvier1;

public class MinusTest extends ExecutionDrvier1  {
	
	
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
		String actualResult = operation.minus(10,5);
		if (actualResult.equals(" 5")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}

	@Test (priority = 2)
	public void negativeTest() {
		String actualResult = operation.minus(-15, -25);
		if (actualResult.equals(" 10")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}
	
	@Test (priority = 3)
	public void decimalTest() {
		String actualResult = operation.minus(5.5, 7.5);
		if (actualResult.equals(" -2")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}
	
	@Test (priority = 4)
	public void positiveNegativeTest() {
		String actualResult = operation.add(-5, 10);
		if (actualResult.equals(" -5")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}
	
	@Test (priority = 5)
	public void negativeDecimalTest() {
		String actualResult = operation.add(-25, 10.5);
		if (actualResult.equals(" -35.5")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}

}
