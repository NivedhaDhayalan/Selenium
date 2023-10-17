package GroupingTestNg;

import org.testng.annotations.Test;

public class Test3 {
	@Test(groups= {"sanity","Windows.smoke"})
    public void test9() {
   	 System.out.println("test9");
    }
    @Test(groups= {"functional", "sanity","Windows.smoke"})
    public void test10() {
   	 System.out.println("test10");
    }
    @Test(groups= {"regression"})
    public void test11() {
   	 System.out.println("test11");
    }
    @Test(groups= {"smoke","Windows.sanity"})
    public void test12() {
   	 System.out.println("test12");
    }

}
