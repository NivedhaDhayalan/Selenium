package ParalleltestingTestNg;

import org.testng.annotations.Test;

public class tofindThreadid {
     @Test
     public void Test1() {
    	 System.out.println("my first test |||  "+Thread.currentThread().getId())  ;
    	 }
     @Test
     public void Test2() {
    	 System.out.println("my second test |||  "+Thread.currentThread().getId())  ;
    	 }
     @Test
     public void Test3() {
    	 System.out.println("my third test ||| "+Thread.currentThread().getId())  ;
    	 }
     
     
     
}
