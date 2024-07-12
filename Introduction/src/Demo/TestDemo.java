package Demo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']//button[contains(@type,'submit')]")).click();
	    Thread.sleep(3000);
	    driver.close();
	}

}
