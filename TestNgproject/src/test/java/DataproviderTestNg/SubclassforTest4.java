package DataproviderTestNg;

import org.testng.annotations.DataProvider;

public class SubclassforTest4 {
     
	@DataProvider
	public Object[] testdata() {
		String[] data = new String[]//single dimension
		{ "target.com",
		"google.com",
		 "walmart.com",
		 "costco.com"};
		return data;
	   }
	@DataProvider(indices = {0,2})
	public Object[] Days() {
		Object[] data = new Object[]//single dimension
		{ "Monday",
		"Tuesday",
		 "wednesday",
		 "Thursday"};
		return data;
	   }
}


