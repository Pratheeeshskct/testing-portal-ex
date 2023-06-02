package selenium.dailyworks.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4_Task3_1 {

public static void main(String[] args) throws InterruptedException {

        //SETTING WEB DRIVER

WebDriverManager.chromedriver().setup();

//START EDGE INSTANCE

WebDriver driver=new ChromeDriver();

//URL

driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");

//MAXIMIZING THE WINDOW SIZE

driver.manage().window().maximize();

//WAIT FOR 5 SECONDS

Thread.sleep(5000);

//SCROLLING TO THE BOTTOM

JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,1000)","");


//ENTERING TEXT INTO TEXTFIELD

driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Fahiem");
driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Mohammed");
driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("fahiemmohammed@gmail.com");
driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("fahiem");
driver.findElement(By.xpath("//*[@id=\"form-register\"]/fieldset[3]/div/div/div[1]")).click();
driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();


//WAIT FOR WINDOWS TO SLEEP
Thread.sleep(5000);

////GO BACK TO THE PAGE
//driver.navigate().back();
//
////WAIT FOR WINDOWS TO SLEEP
//Thread.sleep(2000);
//
////TO REFRESH THE PAGE
//driver.navigate().refresh();
//
////WAIT FOR WINDOWS TO SLEEP
//Thread.sleep(2000);
//
////FORWARD TO THE PAGE
//driver.navigate().forward();

//WAIT FOR WINDOWS TO SLEEP
   Thread.sleep(8000);
   
   driver.quit();
   

}

}