package selenium.dailyworks.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_Exercise3 {

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
		
		String s1=driver.findElement(By.xpath("//*[@id=\"akeeba-renderjoomla\"]/div/div/div[1]/div[1]/div[1]/div/h2/a")).getText();
		System.out.println(s1);
		
		String s2 = driver.findElement(By.xpath("//*[@id=\"akeeba-renderjoomla\"]/div/div/div[1]/div[1]/div[2]/div/h2/a")).getText();
		System.out.println(s2);
		
		String s3 = driver.findElement(By.xpath("//*[@id=\"akeeba-renderjoomla\"]/div/div/div[1]/div[1]/div[3]/div/h2/a")).getText();
		System.out.println(s3);

	}
}	

