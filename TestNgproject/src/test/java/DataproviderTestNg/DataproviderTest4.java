package DataproviderTestNg;

import org.testng.annotations.Test;

public class DataproviderTest4 {
      
	/*We can create a separate class for dataprovider method
	 * we should mention dataproviderclass name in the test method 
	 */
	 @Test(dataProvider = "testdata",dataProviderClass = SubclassforTest4.class)
		public void TestDetails(String[] s ) {
			System.out.println(s);
		}

}
