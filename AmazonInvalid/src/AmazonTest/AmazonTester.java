package AmazonTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonTester {
	
	public static WebDriver driver;
	public static String driverPath = "/Users/dubem/Desktop/chromedriver";

	public static void WebDriver (String URL) throws InterruptedException {
	//Starting up ChromeDriver
	System.setProperty("webdriver.chrome.driver","/Users/dubem/Desktop/chromedriver");
	//Launch Browser
	driver = new ChromeDriver();
	driver.get(URL);
	driver.manage().window().maximize();
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(5000);
		WebDriver("https://www.amazon.com");
		
		//Search for product
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("FIFA 17 PS4");
		driver.findElement(By.className("nav-input")).click();
		
		Thread.sleep(5000);
		
		//Select the first element
		driver.findElement(By.xpath("//*[@id='result_0']/div/div/div/div[2]/div[2]/a")).click();
		
		Thread.sleep(5000);
		
		//Add item to cart
		driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
		Thread.sleep(5000);
		
		//Proceed to checkout
		driver.findElement(By.xpath("//*[@id='hlb-ptc-btn-native']")).click();
		Thread.sleep(5000);
		//Authenticate user
		driver.findElement(By.id("ap_email")).sendKeys("xxxxx@email.com");
		driver.findElement(By.id("ap_password")).sendKeys("password");
		driver.findElement(By.id("signInSubmit")).click();
		
		Thread.sleep(2000);
		
		//Back to cart
		driver.navigate().back();
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		//Click on cart
		driver.findElement(By.id("hlb-view-cart-announce")).click();
		
		Thread.sleep(3000);
		//Delete from cart
		driver.findElement(By.xpath("//*[@id='activeCartViewForm']/div[2]/div/div[4]/div[2]/div[1]/div/div/div[2]/div/span[1]/span/input")).click();
		
		Thread.sleep(2000);
		
		//Open a new tab within current browser
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.COMMAND + "t");
		driver.get("http://www.amazon.com");
	
		Thread.sleep(6000);
		
		driver.quit();
	}
};
