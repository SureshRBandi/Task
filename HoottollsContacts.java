package Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HoottollsContacts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\SURESH RALLABANDI\\\\Downloads\\\\chromedriver_win32 (3)\\\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		ChromeOptions options =new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		//driver.manage().window().maximize();
		
		driver.get("https://www.hottools.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Accept All')]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[@class='button3']")).click();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
		
		
		//accept all cookies 
		//driver.findElement(By.id("truste-consent-button")).click();
		//Refresh Current page
//		Thread.sleep(3000);
//		driver.navigate().refresh();
//		
//		
//		Thread.sleep(2000);
//		
//		WebElement ele=driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]/span[2]"));
//			Actions act=new Actions(driver);
//			act.moveToElement(ele).build().perform();
//			Thread.sleep(2000);
//			//step-products
//			driver.findElement(By.xpath("//*[@id=\"ui-id-7\"]/span")).click();
//			Thread.sleep(4000);
	}

}
