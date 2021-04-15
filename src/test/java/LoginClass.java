
/*import org.testng.annotations.*;*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginClass {
	private static WebElement element = null;

	WebDriver driver;
	public static WebElement SignIn_click(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		return element;

	}
	
	
	public static WebElement button_click(WebDriver driver) {
		element = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		return element;

	}
	

	public static WebElement confirmationmessage(WebDriver driver) {
		element = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		return element;

	}

	public static WebElement textbox_Pass(WebDriver driver) {
		element = driver.findElement(By.id("passwd"));
		return element;

	}

	public static WebElement textbox_email(WebDriver driver) {
		element = driver.findElement(By.id("email"));
		return element;

	}
}
