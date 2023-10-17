package GroupingTestNg;

import org.testng.annotations.Test;

public class Test2 {
	@Test(groups= {"sanity","Windows.smoke"})
    public void test5() {
   	 System.out.println("test5");
    }
    @Test(groups= {"smoke","sanity"})
    public void test6() {
   	 System.out.println("test6");
    }
    @Test(groups= {"functional"})
    public void test7() {
   	 System.out.println("test7");
    }
    @Test(groups="Windows.functional")
    public void test8() {
   	 System.out.println("test8");
    }
}
