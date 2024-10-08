package com.testScript;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RunSpecificTestMethos {
	
     @Test(enabled=false)
	public void method1() {
		Reporter.log("method1",true);
	}
     @Test(enabled=false)
     public void method2() {
    	 Reporter.log("method2",true);
		
	}
     @Test
     public void method3() {
    	 Assert.fail();
    	 Reporter.log("method3",true);
    	
    	 
}
     @Test(enabled=false)
     public void method4() {
    	 Reporter.log("method4",true);
}
}