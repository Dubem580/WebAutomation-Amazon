package AmazonTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopAmazon {
public static WebDriver driver = new ChromeDriver();

public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","/Users/dubem/Desktop/chromedriver");

	        // Initialize the WebDriver instance using ChromeDriver and launch the web browser
	        driver = new ChromeDriver();
	        // Open the application - "https://amazon.com/"
	        driver.get("https://www.amazon.com/ap/signin?_encoding=UTF8&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_custrec_signin");
	        // Maximize the current window
	        driver.manage().window().maximize();
}
{
	  
	        //Navigate to Sign in page
	       driver.findElement(By.id("ap_email")).sendKeys("xxxxxxxxx@email.com");
	       driver.findElement(By.id("ap_password")).sendKeys("xxxxxx");
	       driver.findElement(By.id("signInSubmit")).click();
	       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("FIFA 17 PS4");
	       driver.findElement(By.className("nav-input")).click();
}
}
