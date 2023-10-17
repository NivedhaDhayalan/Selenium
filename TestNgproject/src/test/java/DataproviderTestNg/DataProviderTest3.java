package DataproviderTestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest3 {
       //yes we can partially pass the data in the dataprovider method to the test method
	   // using the indices paremater in the dataprovider method by mentioning the index of the data
	
	  @Test(dataProvider = "testdata")
		public void TestDetails(String[] s ) {
			System.out.println(s);
		}

	@DataProvider(indices = {0,2})
	public Object[] testdata() {
		String[] data = new String[]//single dimension
		{ "target.com",
		"google.com",
		 "walmart.com",
		 "costco.com"};
		return data;
	   }
}
