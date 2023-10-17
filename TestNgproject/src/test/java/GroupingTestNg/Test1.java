package GroupingTestNg;

import org.testng.annotations.Test;

public class Test1 {
	//Grouping is used to categorize different tests together as a single tests or suite 
	//meta groups is groups of groups we can execute a group inside a group partial group is inside aa class level 
	//we can create a group ina suite level or test level n or together
	// we can exclude any of the test using exclude
     @Test(groups= {"smoke"})
     public void test1() {
    	 System.out.println("test1");
     }
     @Test(groups= {"sanity"})
     public void test2() {
    	 System.out.println("test2");
     }
     @Test
     public void test3() {
    	 System.out.println("test3");
     }
     @Test(groups= {"smoke","Regression"})
     public void test4() {
    	 System.out.println("test4");
     }
}
