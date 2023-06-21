package day09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Proram4 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement btn = driver.findElement(By.xpath("//input[@value='Cricket']"));
		
		
		if(btn.isEnabled())
		{
			System.out.println("Button is enabled");
		}
		else
		{
			System.out.println("Button is disabled");
		}

	}

}
