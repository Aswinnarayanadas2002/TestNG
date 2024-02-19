package testNG_learning;

import org.testng.annotations.Test;

public class Priority {
@Test(priority = 1)
	public void First() {
	  System.out.println("I AM THE FIRST");
}
@Test(priority = 2)
    public void Second(){
    	System.out.println("I AM THE SECOND");
    }
//IF WE PROVIDE AS INDEPENDENT METHOD THEN IT WILL BE PRINT AS FIRST
//E.G :- IN THIS PACKAGE EXPECT "THIRD" METHOD EVERYTHING HAVE A PRIORITY , SO "I AM THE THIRD" WILL BE PRINT AS THE FIRST
@Test
    public void Third() {
    	System.out.println("I AM THE THIRD");
    }
@Test(priority = 4)
    public void Fourth() {
    	System.out.println("I AM THE FOURTH");
    }

}
