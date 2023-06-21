package day09;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Program3 {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement btn = driver.findElement(By.xpath("//input[@value='Cricket']"));
		
		btn.click();
		
		if(btn.isSelected())
		{
			System.out.println("Button already Selected");
		}
		else
		{
			btn.click();
	
	}
	}
}


