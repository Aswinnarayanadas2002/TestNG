//EXPECTED EXPECTION
//THIS IS USED FOR WHETHER THE CODE IS FAILED IT SHOWS ERROR MESSAGE IN THE CONSOLE , BUT THAT CODE SHOULD BE PASSED WHICH MEANS IN THE CONSOLE IS 
//SHOWS PASSED INSTEAD OF SHOWING ERROR MESSAGE. IN THAT CASE WE CAN USE THIS "EXPECTED EXPECTION"


package testNG_learning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExpectedException {
	@Test(expectedExceptions = {RuntimeException.class})
	public  void main() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		String name = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).getAttribute("placeholder");
		throw new RuntimeException();
        
	}
}
