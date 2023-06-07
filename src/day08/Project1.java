package day08;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project1 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Java Books"+Keys.ENTER);
		driver.findElement(By.xpath("(//span[contains(text(),'Core Java: An Integrated Approach, New')])[3]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Java 8 Programming Black Book | e | k')]")).click();

		for(String id:driver.getWindowHandles())
			driver.switchTo().window(id);
		if(driver.getCurrentUrl().contains("Core-Java-Integrated-Approach-Versions"))
		{
			Select dropdown = new Select(driver.findElement(By.xpath("//select[@name='quantity']")));
			dropdown.selectByValue("6");
			driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		}
		if(driver.getCurrentUrl().contains("Java-8-Programming-Black-Book"))
		{
			Select dropdown = new Select(driver.findElement(By.xpath("//select[@name='quantity']")));
			dropdown.selectByValue("2");
			driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		}
	}



	}


