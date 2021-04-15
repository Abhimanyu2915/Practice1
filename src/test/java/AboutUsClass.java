/*import org.testng.annotations.Test;*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutUsClass {
	private static WebElement element = null;
	WebDriver driver;
	
	public static WebElement AboutUs_click(WebDriver driver) {
		element = driver.findElement(By.linkText("About us"));
		return element;

	}
}
