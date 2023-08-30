package stepDefinitions;

import io.cucumber.java.Before;

public class hooksRunner {

	@Before ("@SmokeTest")
	public void preCondition01(){
		System.out.println("**********************************************");
		
	}
	@Before ("@SanityTest")
	public void preCondition02() {
		System.out.println("================================================");
	}
}
