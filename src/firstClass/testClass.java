package firstClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Porkodi.murugesan\\\\Downloads\\\\chromedriver_win32.zip");
		WebDriver driver=new ChromeDriver();
		driver.get("https://assurant.qtestnet.com/");
		
		
	}

}
