


/*import org.openqa.selenium.By;*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstClass {
	
	WebDriver driver;
  @Test
  public void Method1() {
	  String url = "http://automationpractice.com/index.php";
		String chromePath = "C:\\Users\\abhimanyu.chauhan\\Desktop\\A\\notes\\Selenium Files\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", chromePath);
		driver = new ChromeDriver();
		driver.navigate().to(url);
		LoginClass.SignIn_click(driver).click();
		LoginClass.textbox_email(driver).sendKeys("manuchauhan2915@gmail.com");
		LoginClass.textbox_Pass(driver).sendKeys("chauhan");
		LoginClass.button_click(driver).click();
		AboutUsClass.AboutUs_click(driver).click();
	  
  }
}
