package com.AutomationMaven.task;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateCustomerTest {
      @Test
      public void CreateCustomer() {
	  Reporter.log("Customer Created",true);
  }
      @Test
      public void ModifyCustomer() {
      Reporter.log("Modify Customer",true);  
  }
}
