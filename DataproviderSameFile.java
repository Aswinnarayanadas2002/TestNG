package testNG_learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderSameFile {
	@DataProvider(name="login")
	public String[][] getData() {
		String [][] data = new String[2][2];
		data[0][0]="ZAInTestLR@gmail.com";
		data[0][1]="Z@in123456";
		
		data[1][0]="ZAInTestLRY@gmail.com";
		data[1][1]="Z@in1234567";
		
		return data;
	}
	
	@Test(dataProvider = "login")
	
	public void main(String email, String password) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kw.zain.com/en/shop");
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id=\"profiledropdown-btn\"]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Login'])[3]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys(email);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='SIGN IN']")).click();

		System.out.print("success");

	}
}
