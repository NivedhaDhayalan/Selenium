package DependencyTestNg;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class dependsonMethod {
	//dependency in TestNg allowed a test to depend on some other method or methods
    // in Testng we want methods in a testcase to run in particular order
	//uses to share some data or state between two methods
	//to avoid test cases which is depend on main method if main method failed or else it will try to execeute other method which is time waste
	
	@Test 
	public void login() {
		System.out.println("login to the amazon website");
		// commented this method to check what happen to the methods which is 
	    // depend on this method
	}
	
	
    //    if priority added with dependency then priority is ignored 
    //	dependency takes high precedence
	// the login method is not there but still we mentioned in is depedonmethod if we run it throws exception 
	//irrespective of the ignored or disabled or remove we can run using ignoremissingdependency as true
    @Test(dependsOnMethods= {"login"}, ignoreMissingDependencies = true)
     public void search() {
    	System.out.println("search for the product");
}


    @Test(dependsOnMethods= {"search"})
    public void product() {	
    	System.out.println("click on the product");
}

    @Ignore
    @Test(dependsOnMethods= {"login" , "product"},ignoreMissingDependencies = true)
    public void addtocart() {	
    	System.out.println("add the product to the cart");
  }
    
    
    // if the dependent method is ignored or failed the current method will not run
    //so using alwaysRun set to true it will check depend method if it 
    //is not there also the current method will run
     @Test(dependsOnMethods= {"addtocart"},alwaysRun = true)
     public void buy() {	
        System.out.println("pay for the product");
}
}

