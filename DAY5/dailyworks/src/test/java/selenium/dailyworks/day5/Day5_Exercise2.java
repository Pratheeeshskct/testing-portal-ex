package selenium.dailyworks.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_Exercise2 {

	public static void main(String[] args)throws InterruptedException{
		WebDriverManager.chromedriver().setup();

		

		WebDriver driver=new ChromeDriver();

		//URL

		driver.get("https://j2store.net/free/");

		//MAXIMIZING THE WINDOW SIZE

		driver.manage().window().maximize();
		
		
	    Thread.sleep(5000);
	    
	    String s1=driver.getCurrentUrl();
	    System.out.println(s1);
	    
	    if(s1 == "https://j2store.net/free/")
		{
			System.out.println("Valid");
		}
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)","");
		
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
		                      
		String s2=driver.getCurrentUrl();
	    System.out.println(s2);
	    
	    if(s2 == "https://j2store.net/free/index.php/shop?filter_catid=11")
		{
			System.out.println("Valid");
		}

	}

}