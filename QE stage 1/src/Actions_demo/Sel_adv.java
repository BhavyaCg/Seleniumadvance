package Actions_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_adv {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Bhavya\\chromedriver_win32_Latest\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/login.htm");
        System.out.println(driver.getTitle());
        
        driver.findElement(By.name("userName")).sendKeys("Lalitha");
        driver.findElement(By.name("password")).sendKeys("Password123");
        //driver.findElement(By.name("Login")).click();
        driver.findElement(By.cssSelector("input[value='Login']")).click();
        
        
        
        //driver.close();
    }

 

}

