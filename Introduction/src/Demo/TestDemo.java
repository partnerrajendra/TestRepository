package Demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://toolsqa.com/selenium-webdriver/run-selenium-test-script/");
	    driver.manage().window().maximize();
		

	}

}
