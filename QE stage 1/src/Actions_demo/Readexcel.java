package Actions_demo;

import java.io.File;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class Readexcel {
	
			    
		WebDriver driver;

		File FRead;
		XSSFWorkbook wb;
		XSSFSheet sh;
		String d1,d2;

		 

		@BeforeTest
		public void beforeTest() throws Exception, Exception {
		    System.setProperty("webdriver.chorme.driver", "C:\\Bhavya\\chromedriver_win32_Latest\\chromedriver.exe");
		    driver = new ChromeDriver();
		   FRead=new File("C:\\Bhavya\\ddt_demo.xlsx");
		   wb=new XSSFWorkbook(FRead);
		   sh= wb.getSheetAt(0); 
		    
		  
		    /*String*/ d1=sh.getRow(0).getCell(0).getStringCellValue();
		    /*String*/ d2=sh.getRow(0).getCell(1).getStringCellValue();

		 

		} 
		  @Test
		  public void ReadWrite() {
		      System.out.println(d1);
		      System.out.println(d2);
		  }
		  
		  @AfterTest
		  public void afterTest() throws Exception {
		      driver.close();
		      wb.close();
		      
		  }

		 

		  
		  @AfterMethod
		  public void afterMethod() throws Exception {
		      
		  }
		
	

}
