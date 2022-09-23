package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import pages.BasePage;

public class hooks extends BasePage {

    public hooks() {
        super(driver);

    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario.log("Prueba Fallida");
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            //scenario.embed(screenshot, "image/png");
            //En vez de embed se utilizo attach ya que estamos trabajando con una version de cucumber mas avanzada y desde Cucumber 6.0 en adelante, se elimino embed().
            //attach tambien recibe bytes 
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
    }
}
