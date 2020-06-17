package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleDemo {
	
	
		 WebDriver driver;
		 String msg;

		 

		 @BeforeTest
		 public void beforeTest() throws InterruptedException {
		      driver=new ChromeDriver();
		      driver.get("https://www.google.co.in");
		      Thread.sleep(2000);
		 }
		 
		 @Test
		  public void TestAssert() {
		        msg= driver.getTitle();
		  }
		    
		 @Test
		      public void TestAssertB() {
		            Assert.assertEquals(msg, msg);
		            System.out.println("Title is same");
		      }

		 

		 @Test
		      public void TestAssertB1() {
		            Assert.assertEquals(msg, "some wrong Titile");
		      }

		 

		 /*@Test(dependsOnMethods ="TestAssertB")
		      public void TestAssertB3() {
		            System.out.println("This is printed");
		      }
		    
		 @Test(enabled =false)
		 public void TestAssertB4() {
		        System.out.println("This is not printed");
		 }
		*/  

		 

		  @AfterTest
		  public void afterTest() {
		      
		  }

		 

		}


