#WebAutomation-Amazon

#Overview

Selenium ChromeDriver for automating web tests:

The goal of these tests was to automate login, sign in, invalid login, search, add to cart features of a web application. 

Specifically, using Amazon’s dynamic web application. Selenium makes use of the inspected elements to trigger the automation. 

Essentially, a browser of choice(Google Chrome was the aim of this project) should be chosen for this simple project.

#Environment Setup
##Selenium Web Driver

1.Download [Selenium Client library for Java] (http://selenium-release.storage.googleapis.com/3.0/selenium-java-3.0.1.zip).

	-Store the .jar in location of choice.
2.Download [Google Chrome Driver] (http://chromedriver.storage.googleapis.com/index.html?path=2.25/).

	-Store in location of choice, preferably in a working folder.
3.Using Eclipse or IntelliJ, load the selenium.jar library files and specify the 
ChromeDriver.exe path location in your Java file.
##Using Selenium WebDriver NPM (Javascript)

1.Visit the official [npmjs] (https://www.npmjs.com/package/selenium-webdriver) website for more information.

2. Ensure the component for your web browser of choice has been downloaded. For this purpose, it is [Chrome].

3.Once the above procedures have checked out, open up a text editor and look through [test2.js] to understand what the script will be doing.

4. From the command line, cd into the working directory and run the command: 
	-[node test2.js]