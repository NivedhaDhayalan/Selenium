package PrioritizationTestNg;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestngPriority {
    //if priority not mentioned then default value is 0
	//negative values are accepted in Testng
	//if multiple methods are mentioned with the same priority integer it will prioritize based on the ASCII value
	//why priority used because if we wanted to run our testcases based on the specific order priority parameter used in @test annotation
	
	@Test(priority=-1)
	public void signup(){
		System.out.println("signup");
	}
	
	@Test(priority=0)
	public void login() {
		System.out.println("Login");
	}
	@Test(priority=1)
	public void searchfortheticket(){
		System.out.println("searchfortheticket");
}
	//is used to ignore that method or class  or package. 
	//we mentioned ignore here so while running it will ignore this method and run all other methods
	//if we mentioned enables in the method ignore takes the higher precedence.
	//we can also put @ignore at the class level
	
	@Ignore//for creating @ignore at the package level we have create new->file->package-info.java->@ignore should mentioned in that file
	@Test(priority=2)
	public void filtertheTicket(){
		System.out.println("filtertheTicket");
}
	@Test(priority=3)
	public void BooktheTicket(){
		System.out.println("BooktheTicket");
}
	@Test(priority=4)
	public void savetheTicket(){
		System.out.println("savetheTicket");
}   @Ignore
	@Test(priority=5)
	public void logout(){
		System.out.println("logout");
}
}