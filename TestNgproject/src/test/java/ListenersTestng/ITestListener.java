package ListenersTestng;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersTestng.TestNgListeners.class)
public class ITestListener {
	@Test
	public  void test1() {
   	 System.out.println("Test1");
    }
	@Test
    public  void test2() {
   	 System.out.println("Test2");
   	    }
	@Test(timeOut = 2000)
    public  void test3() {
   	 System.out.println("Test3");
   	 Assert.assertTrue(false);

}
	@Test
    public  void test4() {
   	 System.out.println("Test4");
}
}
