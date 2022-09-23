package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = "src/test/resources/features", 
  glue = "steps",
  plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
  monochrome = true, 
  tags = "@Amazon"

)
public class runner {
  @AfterClass
  public static void clearDriver() {
    BasePage.closeBrowser();
  }
}
