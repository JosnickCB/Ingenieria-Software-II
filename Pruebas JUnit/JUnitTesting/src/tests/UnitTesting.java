package tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UnitTesting {
	public String solve(String argx,String argy) {
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\JOSNICK\\eclipse-workspace\\geckodriver.exe");
	      WebDriver driver = new FirefoxDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.navigate().to("http://www.calculator.net/");
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath("/html/body/div[4]/div/table/tbody/tr/td[3]/div[2]/a")).click();
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[2]/tbody/tr/td/div[3]/a")).click();
	      driver.findElement(By.id("cpar1")).sendKeys(argx);
	      driver.findElement(By.id("cpar2")).sendKeys(argy);
	      driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[1]/tbody/tr[2]/td/input[2]")).click();
	      String result = driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
	      System.out.println("Input A = "+argx+" | Input B = "+argy+" :: Con resultado "+result);
	      
	      //Close the Browser.
	      driver.close();
	      
	      return result;
	   }
}