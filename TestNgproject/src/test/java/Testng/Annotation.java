package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
    @BeforeSuite
     public void beforesuite() {
	 System.out.println("beforesuite");
     }
    @BeforeClass
    public void beforeclass() {
   	 System.out.println("beforeclass");
        }
    @BeforeMethod
    public void beforemethodt() {
   	 System.out.println("beforemethod");
        }
    @BeforeTest
    public void beforetest() {
   	 System.out.println("beforetest");
        }
    @Test
    public void test() {
   	 System.out.println("test");
        }
    @AfterTest
    public void AfterTest() {
   	 System.out.println("Aftertest");
        }
    @AfterMethod
    public void AfterMethod() {
   	 System.out.println("@AfterMethod");
        }
    @AfterClass
    public void AfterClass() {
   	 System.out.println("@AfterClass");
        }

@AfterSuite
public void Aftersuite() {
  	 System.out.println("@Aftersuite");
       }
}
