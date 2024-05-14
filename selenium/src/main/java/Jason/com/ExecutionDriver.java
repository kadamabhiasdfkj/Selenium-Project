package Jason.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public abstract class ExecutionDriver {
	
	@BeforeSuite
	public void m1() {
		
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void m2() {
		System.out.println("After Suite");
	}
	
	@BeforeTest
	public void m3() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void m4() {
		System.out.println("After Test");
	}
	
	
	
	@BeforeClass
	
	public void m5() {
		
		System.out.println("Before Class");
	}
	
	
   @AfterClass
	
	public void m6() {
		
		System.out.println("After Class");
	}
   
   
   @BeforeMethod
   public void m7() {
	   
	   System.out.println("Before Method");
   }
   
   
   @AfterMethod
   public void m8() {
	   System.out.println("After Method");
   }
	

}
