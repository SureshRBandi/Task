package Task1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\SURESH RALLABANDI\\\\Downloads\\\\chromedriver_win32 (3)\\\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		ChromeOptions options =new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		//driver.manage().window().maximize();
		
		driver.get("https://www.etsy.com/");
		driver.manage().window().maximize();
	}

}
