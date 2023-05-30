package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Program1 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		Select skillDropdown = new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		//skillDropdown.selectByIndex(4);
		
		
		//skillDropdown.selectByValue("Art Design");
		
		
		skillDropdown.selectByVisibleText("Backup Management");
		
		 Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));

		 yearDropdown.selectByValue("1997"); 

		 Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));

		 monthDropdown.selectByValue("January"); 

		 Select day=new Select(driver.findElement(By.xpath("//select[@ng-model='daybox']")));

		 day.selectByVisibleText("25");
		


	}

}
