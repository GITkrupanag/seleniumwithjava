package seleniumwithjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement un=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(un);
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		WebElement img1=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='trash']"));
		a.dragAndDrop(img1, drop).perform();
		WebElement img2=driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement drop1=driver.findElement(By.xpath("//div[@id='trash']"));
		a.dragAndDrop(img2, drop1).perform();
		WebElement img3=driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement drop2=driver.findElement(By.xpath("//div[@id='trash']"));
		a.dragAndDrop(img3, drop2).perform();
		WebElement img4=driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement drop3=driver.findElement(By.xpath("//div[@id='trash']"));
		a.dragAndDrop(img4, drop3).perform();
		

	}

}
