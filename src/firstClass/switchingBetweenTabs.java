package firstClass;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchingBetweenTabs {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wedriver.chrome.driver", "C:\\Users\\Porkodi.murugesan\\Downloads\\chromedriver_win32.zip");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String clickl = Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver.findElement(By.xpath("//*[text()='Terms of Use']")).sendKeys(clickl);
		//Thread.sleep(1000);
		ArrayList<String> newTab= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTab.get(1));
		System.out.println("Page title of new tab: " + driver.getTitle());
		driver.switchTo().window(newTab.get(0));
		System.out.println("Page title of parent window: " + driver.getTitle());
		driver.quit();
	}
	
}
