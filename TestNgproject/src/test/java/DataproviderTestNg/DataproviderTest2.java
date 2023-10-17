package DataproviderTestNg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTest2 {
	
	//we are using OBJECT here instead of String Int because Obj is superclass for all
	//dataprovider method returns==>obj[] , obj[][],  Iterator<object>, iterator<obj[]>
	
    @Test(dataProvider = "testdata")
	public void loginData(String username,String password ) {
	//	System.out.println(s[0]+"   "+s[1]);
	}

@DataProvider
public Object[] testdata() {
	Object[] data = new Object[3];//single dimension
	data[0] = "target.com";
	data[1]="google.com";
	data[2] = "walmart.com";
	return data;
   }
@DataProvider
	public Object[][] loginData(){
	Object[][] data = new Object[2][2];//2D array
	data[0][0] = "Admin";
	data[0][1] = "admin123";
		
	data[1][0]= "xyz";
	data[1][1] = "admin123";
	return data;
	}

   @DataProvider
   public  Iterator<String> listofpeople() {
	   List<String> data = new ArrayList<>();//Iterator<object>
	   data.add("nive");
	   data.add("aaditya");
	   data.add("raghav");
	   return data.iterator();
   }
   @DataProvider
   public  Iterator<Object[]> listofnames() {
	   Set<Object[]> data = new HashSet<>();//Iterator<object[]>
	   data.add(new String[] {"nive" , "111", "sdessd"});
	   data.add(new String[] {"Aaditya" , "222"});  
	   data.add(new String[] {"Raghav" , "333"});
	   return data.iterator();
   }

}

