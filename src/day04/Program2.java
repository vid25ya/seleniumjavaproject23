package day04;


import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) {
	
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://demo.automationtesting.in/Alerts.html");
		Driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]")).click();
		Driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
		
		System.out.println(Driver.switchTo().alert().getText());
		
		Driver.switchTo().alert().dismiss();

	}


	}


