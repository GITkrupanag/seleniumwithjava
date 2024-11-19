package seleniumwithjava;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		WebElement un=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		un.click();
		Alert a=driver.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
		WebElement vn=driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
		vn.click();
		WebElement an=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		an.click();
		driver.switchTo().alert();
		Thread.sleep(2000);
		a.dismiss();
		WebElement mn=driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']"));
		mn.click();
		WebElement kn=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		kn.click();
		driver.switchTo().alert();
		Thread.sleep(2000);
		a.sendKeys("Krupa Nag");
		a.accept();	

	}

}
