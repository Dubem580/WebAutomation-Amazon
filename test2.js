var webdriver = require('selenium-webdriver'),
    By = require('selenium-webdriver').By,
    until = require('selenium-webdriver').until;

var driver = new webdriver.Builder()
    .forBrowser('chrome')
    .build();

driver.get('https://amazon.com/');
driver.manage().window().maximize();
driver.sleep(3000);

var expectedTitle = ("Online Shopping for Electronics, Apparel, Computers, Books, DVDs &amp; more");
driver.getTitle().then(function(title) {
    if(expectedTitle === title)
    {
        console.log("Welcome to Amazon");
    }
    else{
        console.log("Wrong title");
    }
});

//Navigate to Sign in page
driver.findElement(By.id('nav-link-yourAccount')).click();

driver.sleep(5000);

// Enter an invalid username and password
driver.findElement(By.id('ap_email')).sendKeys('InvalidUser@yahoo.com');    
driver.findElement(By.id('ap_password')).sendKeys('InsaneMonkey');    

driver.sleep(3000);
// Click on login button
driver.findElement(By.id('signInSubmit')).click();

 //Verify that error message is displayed for authentication failure.
var errorMessage = ('We can not find an account with that email address');
driver.findElement(By.xpath("//*[@id='auth-error-message-box']/div/h4")).then(function(element)
{
 console.log("Wrong SignIn, Fix it");
}, function(error) {
    console.log("Correct SignIn");
});

driver.sleep(5000);
//Navigate to different website
driver.navigate().to("http://dubemxokam.com/tester.html");

driver.sleep(3000);

//Handle the alerts
driver.switchTo().alert().accept();
driver.sleep(4000);
driver.switchTo().alert().accept();

//Final sleep
driver.sleep(10000);
        
driver.quit();

