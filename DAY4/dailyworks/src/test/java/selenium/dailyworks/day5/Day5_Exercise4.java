package selenium.dailyworks.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_Exercise4 {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();

		

		WebDriver driver=new ChromeDriver();

		//URL

		driver.get("https://j2store.net/free/");

		//MAXIMIZING THE WINDOW SIZE

		driver.manage().window().maximize();
		
		
	    Thread.sleep(5000);
	    
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)","");
		
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.close();

	}

}