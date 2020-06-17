package Actions_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Bhavya\\chromedriver_win32_Latest\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Actions a1 = new Actions(driver);
        
        a1.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform();
	}

}
