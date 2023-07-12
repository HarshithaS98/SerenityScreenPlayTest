package pageObjects;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage extends PageObject {

    public static final Target USERNAME = Target.the("Username")
            .locatedBy("//*[@id=\"loginPanel\"]/form/div[1]/input");

    public static final Target PASSWORD = Target.the("Password")
            .locatedBy("//*[@id=\"loginPanel\"]/form/div[2]/input");

    public static final Target LOGIN_BTN = Target.the("Login Button")
            .locatedBy("//*[@id=\"loginPanel\"]/form/div[3]/input");
}


