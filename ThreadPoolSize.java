//THREADPOOLSIZE
//THREADPOOLSIZE IS HELPS TO OPENS A BROWSER F.EG "threadPoolSize = 2" WHICH MEANS IT'S OPENS A TWO BROWSER 
//HERE "invocationCount = 3" THE CODE WILL RUN ON THREE TIMES BUT WE OPEN ONLY 2 BROWSER . IN THIS CASE HOW WE CAN ABLE TO RUN THE CODE 3 TIMES ?
//ASWER:- IN THE 2 BROWSER FIRST 2 CODE WILL BE EXECUTED AND THEN WHICH BROWSER WILL BE CLOSED FIRST IN THAT BROWSER THE 3 EXCUTION WILL BE START


package testNG_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThreadPoolSize { 
@Test(invocationCount = 3,threadPoolSize = 2)
		public  void main() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.automationtesting.in/Register.html");
			String name = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).getAttribute("placeholder");
	        System.out.println(name);
	        driver.quit();
		}
	}

