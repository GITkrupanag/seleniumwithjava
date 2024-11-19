package seleniumwithjava;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seliniumweb {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		WebElement insta=driver.findElement(By.xpath("//a[@title=\"Take a look at Instagram\"]"));
	    insta.click();
	    
	   String pw=driver.getWindowHandle();
	   System.out.println(pw);
	   Set<String>aw=driver.getWindowHandles();
	   System.out.println(aw);
	   for(String a :aw) {
		   if(!(pw).equals(a)) {
			   driver.switchTo().window(a);
		   }
	   }
	   
	   Thread.sleep(2000);     
	    WebElement userna=driver.findElement(By.xpath("//input[@name='username']"));
	    userna.sendKeys("Krupa");
	    

	}

}
