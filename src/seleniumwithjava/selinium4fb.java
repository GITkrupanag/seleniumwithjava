package seleniumwithjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selinium4fb {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		WebElement un=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		un.sendKeys("Admin");
		WebElement vn=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		vn.sendKeys("admin123");
		WebElement ln=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		ln.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		

	}

}
