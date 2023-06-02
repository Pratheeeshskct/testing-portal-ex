package selenium.dailyworks.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4_Task3_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		//START EDGE INSTANCE

		WebDriver driver=new ChromeDriver();

		//URL

		driver.get("https://demo.opencart.com/");

		//MAXIMIZING THE WINDOW SIZE

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).isDisplayed();
		

	    Thread.sleep(5000);
		
		//SCROLLING TO THE BOTTOM

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)","");
		
		System.out.println(driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[2]/a")).getText());
		
		System.out.println( driver.findElement(By.xpath("/html/body/footer/div/div/div[3]/ul/li[2]/a")).getText());

		
		//Task3
		System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/h3")).getText());
		
	}

}