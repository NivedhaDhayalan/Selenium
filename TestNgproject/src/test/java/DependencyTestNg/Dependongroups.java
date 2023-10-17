package DependencyTestNg;

import org.testng.annotations.Test;

public class Dependongroups {
	
	   
		@Test(groups = {"smoke"})
		public void Test1() {
			System.out.println("smoke");
		}

	     @Test(groups = {"smoke"})
	     public void Test2() {
		System.out.println("smoke");
	}
	     @Test(groups = {"sanity"})
	     public void Test3() {
		System.out.println("sanity");
	}
	     @Test(groups = {"sanity"})
	     public void Test4() {
		System.out.println("sanity");
	}
	     @Test(groups = {"functional"})
	     public void Test5() {
		System.out.println("functional");
	}
	     @Test(groups = {"sanity"})
	     public void Test6() {
		System.out.println("sanity");
	}
	     @Test(groups = {"regression"})
	     public void Test7() {
		System.out.println("Regression");
	}
	     
	     @Test(groups = {"regression"})
	     public void Test8() {
		System.out.println("Regression");
	}
//	     @Test(dependsOnGroups = {"smoke", "sanity", "regression"})
//	     public void Test0() {
//		System.out.println("Tests passed");
	//}
	}
	
