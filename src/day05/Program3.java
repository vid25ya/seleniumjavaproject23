package day05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		//driver.switchTo().frame("single frame");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
		
		driver.findElement(By.xpath("//input[@='text']")).sendKeys("test");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='iframe with an iframe']")).click();
		
		

	}

}
