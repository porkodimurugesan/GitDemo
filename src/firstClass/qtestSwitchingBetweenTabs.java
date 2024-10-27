package firstClass;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qtestSwitchingBetweenTabs {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("wedriver.chrome.driver", "C:\\Users\\Porkodi.murugesan\\Downloads\\chromedriver_win32.zip");
		WebDriver driver=new ChromeDriver();
		driver.get("https://assurant.qtestnet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String click1= Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver.findElement(By.linkText("Tricentis")).sendKeys(click1);
		ArrayList<String> newTab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTab.get(1));
		System.out.println("NewTab Name is "+ driver.getTitle());
		driver.close();
		driver.switchTo().window(newTab.get(0));
		System.out.println("OldTab Name is"+ driver.getTitle());
		driver.quit();
	}
}
