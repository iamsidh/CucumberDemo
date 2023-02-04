package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	WebDriver driver;

	By txt_username = By.id("name");

	By txt_password = By.id("password");

	By btn_login = By.id("login");

	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}

	public void enterUsername(String username) {

		driver.findElement(txt_username).sendKeys(username);

	}

	public void enterPassword(String password) {

		driver.findElement(txt_password).sendKeys(password);
	}

	public void clickLogin() {

		driver.findElement(btn_login).click();
	}
	
	public void initialize() {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	}
	
	public void getURL(String url) {
		
		driver.navigate().to(url);
	}
	
	public void tearDown() {
		
		driver.close();
		driver.quit();
	}

	

}
