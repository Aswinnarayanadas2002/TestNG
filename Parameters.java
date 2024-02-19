package testNG_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parameters {
	@org.testng.annotations.Parameters({"name","lastname","email","number","pass","cpass"})
	@Test
	public  void main(String name, String lastname ,String email, String num, String pass, String cpass) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys(name);
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys(lastname);
        driver.findElement(By.xpath("//input[@class=\"form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required\" and @ng-model=\"EmailAdress\"]")).sendKeys(email);
        driver.findElement(By.xpath("//input[@class=\"form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern\" and @ng-model=\"Phone\"]")).sendKeys(num);
        driver.findElement(By.xpath("(//input[@name=\"radiooptions\"])[1]")).click();
        driver.findElement(By.xpath("//input[@class=\"form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-minlength\" and @ng-model=\"Password\"]")).sendKeys(pass);
        driver.findElement(By.xpath("//input[@class=\"form-control ng-pristine ng-untouched ng-invalid ng-invalid-required\" and @ng-model=\"CPassword\"]")).sendKeys(cpass);
        
    
        driver.quit();
	}

}
