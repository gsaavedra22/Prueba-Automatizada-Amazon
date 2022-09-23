package steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AmazonSearchPage;

public class AmazonSearchSteps {

  AmazonSearchPage amazon = new AmazonSearchPage();

  @Given("^the user navigates to www.amazon.com$")
  public void navigateToAmazon() {
    amazon.navigateToAmazon();
  }

  @And("^searches for (.+)$")
  public void enterSearchCriteria(String criteria) {
    amazon.enterSearchCriteria(criteria);
    amazon.clickSearch();
  }

  @And("^navigates to the second page$")
  public void navigateToSecondPage() {
    amazon.goToPage2();
  }

  @And("^selects the third item$")
  public void selectThirdItem() {
    amazon.pick3rdItem();
  }

  @Then("^the user is able to add it to the cart$")
  public void itemCanAddedToTheCart() {
    amazon.addToCart();
    Assert.assertEquals("Added to Cart", amazon.addedCartMessage());
  }
}
