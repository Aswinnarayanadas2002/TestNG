package testNG_learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DataproviderDifferentFile {
	@Test(dataProvider = "Crediential")
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
