package seleniumwithjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selinium5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		WebElement un=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		un.sendKeys("Admin");
		//driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		//driver.quit();
		WebElement vn=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		//driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		vn.sendKeys("admin123");
		WebElement ln=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		if(ln.isDisplayed()&&ln.isEnabled()) {
		ln.click();
		}
		Thread.sleep(2000);
		WebElement mi=driver.findElement(By.xpath("//span[normalize-space()='My Info']"));
		mi.click();
		Thread.sleep(2000);
		WebElement ml=driver.findElement(By.xpath("//label[normalize-space()='Male']"));
		WebElement fl=driver.findElement(By.xpath("//label[normalize-space()='Female']"));
		if(fl.isSelected()) {
			ml.click();
		}
		else {
			fl.click();
		}
		WebElement sa=driver.findElement(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//button[@type='submit'][normalize-space()='Save']"));
		sa.click();
		
		
		

		

	}

}
