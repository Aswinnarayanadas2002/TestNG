package testNG_learning;

import org.testng.annotations.Test;

public class Groups {

	
		@Test(groups = {"Sanity"})
			public void Sanity1() {
			  System.out.println("THIS IS SANITY 1");
		}
		@Test(groups = {"Sanity"})
		    public void Sanity2(){
		    	System.out.println("THIS IS SANITY 2");
		    }
		@Test(groups = {"Smoke"})
		    public void Smoke() {
		    	System.out.println("THIS IS SMOKE");
		    }
		@Test(groups = {"Uat"})
		    public void Uat() {
		    	System.out.println("THIS IS UAT");
		    }


}

