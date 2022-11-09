package Practice;

import org.testng.annotations.Test;


public class CreateCustomerTest  {

	//@Test(priority=0,invocationCount=2)
	public void createCustomer() {
		System.out.println("Customer account created successfully");	
	}
	//@Test(priority=1,invocationCount=3,dependsOnMethods = "createCustomer")
	public void updateCustomer(){
	System.out.println("Customer account updated successfully");
	}
	//@Test(priority=2,invocationCount=4,enabled=false)
	public void deleteCustomer(){
	System.out.println("Customer account delected successfully");
	}

	//@Test(dependsOnMethods = "updateCustomer")
	public void zModifyCustomer(){
	System.out.println("Customer zmodify delected successfully");
	}
	//@Test
	public void ModifyCustomer(){
	System.out.println("Customer zmodify delected successfully");
	}
	
}
