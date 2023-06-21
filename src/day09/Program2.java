package day09;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Program2 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		
		if(login.isDisplayed())
		{
			login.click();
		}
		else
		{
			System.out.println("Log-in button is not displayed");
		}

	}

}
