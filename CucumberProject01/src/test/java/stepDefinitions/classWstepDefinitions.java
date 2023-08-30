package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.*;

public class classWstepDefinitions {
	@Given("user land on NetBanking page")
	public void user_land_on_net_banking_page() {
	   System.out.println("user land on NetBanking page");
	}

	@And("user login into application")
	public void user_login_into_application() {
	    System.out.println("user login into application");
	}
	
	@Given("^user login into application with (.+) and (.+)$")
	public void user_login_into_application_with_and(String username, String password) {
	   System.out.println("username is: " +username);
	   System.out.println("password is: " +password);
	}
	
	@Given("user signup into application")
	public void user_signup_into_application(List<String> dataTable) {
	    System.out.println("dataTable.get(0)");
	    System.out.println("dataTable.get(1)");
	    System.out.println("dataTable.get(2)");
	    System.out.println("dataTable.get(3)");
	    System.out.println("dataTable.get(4)");
	    System.out.println("dataTable.get(5)");
	    System.out.println("dataTable.get(6)");
	  
	}

	@Then("Homepage is displayed")
	public void homepage_is_displayed() {
	    System.out.println("Homepage is displayed");
	}

	@And("Cards are displayed")
	public void crads_are_displayed() {
	   System.out.println("Cards are displayed");
	}

}
