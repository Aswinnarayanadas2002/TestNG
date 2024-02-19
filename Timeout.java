package testNG_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Timeout {
	@Test(timeOut = 2000)
	public  void main() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		String name = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).getAttribute("placeholder");
        System.out.println(name);
        driver.quit();
	}


}
