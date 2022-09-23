package pages;


public class AmazonSearchPage extends BasePage {

  private String searchBox = "//*[@id='twotabsearchtextbox']";
  private String searchButton = "//*[@id='nav-search-submit-button']";
  private String thirdResult ="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[3]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]";
  private String addToCarButton = "//*[@id='add-to-cart-button']";
  private String addedMessageText = "//span[contains(text(),'Added to Cart')]";

  public AmazonSearchPage() {
    super(driver);
  }

  public void navigateToAmazon() {
    navigateTo("https://www.amazon.com/");
  }

  public void enterSearchCriteria(String criteria) {
    write(searchBox, criteria);
  }

  public void clickSearch() {
    clickElement(searchButton);
  }

  public void goToPage2() {
    goToLinkText("2");
  }

  public void pick3rdItem() {
    clickElement(thirdResult);
  }

  public void addToCart() {
    clickElement(addToCarButton);

  }
  public String addedCartMessage(){
    return textFromElement(addedMessageText);
  }



 
}
