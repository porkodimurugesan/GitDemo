package learningSelenium;


import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;  


public class launchBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Porkodi.murugesan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
    	options.addArguments("--remote-allow-origins=*");
   		WebDriver driver=new ChromeDriver(options);
		driver.get("http://demo.guru99.com/test/selenium-xpath.html"); 
		
	}
}
