//WE CAN USE BOTH PRIORITY AND DEPENDSONMETHOD IN THE SAME METHOD 
//BUT TESTNG GIVES THE HIGH PRIORITY TO DEPENDSONMETHOD
//EG :- @Test(dependsOnMethods ="Singup", priority = 1)


package testNG_learning;



import org.testng.annotations.Test;

public class DependsOnMethod {

	@Test()
	public void Singup() {
		System.out.println("SIGNUP THE WEBSITE");
	}

	@Test(dependsOnMethods ="Singup")
	public void login() {
		System.out.println("LOGIN THE WEBSITE");
	}

	@Test(dependsOnMethods = "login",priority = 5)
	public void search() {
		System.out.println("SEARCH THE PRODUCT");
		throw new RuntimeException();
	}

	@Test(dependsOnMethods = "search")
	public void addtocart() {
		System.out.println("PRODUCT IS ADD ON ADDTOCART");
	}

	@Test(dependsOnMethods = "addtocart")
	public void signout() {
		System.out.println("SIGNOUT THE WEBSITE");

	}

}
