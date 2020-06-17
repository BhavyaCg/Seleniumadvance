package Actions_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Bhavya\\chromedriver_win32_Latest\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Actions a1 = new Actions(driver);
        
    a1.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'AboutUs')]"))).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Our')]"))).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Chennai')]"))).click().build().perform();
        
	}

}
