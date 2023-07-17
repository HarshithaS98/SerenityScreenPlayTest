package screenplaytests;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import screenPlaySteps.loginSteps;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;

@UseTestDataFrom("C:\\harshithas\\SerenityGradle\\SerenityGradle\\src\\test\\resources\\testData\\credentialinfo.csv")
@RunWith(SerenityParameterizedRunner.class)
public class datadrivenTests {
    private String username;
    private String password;
    private Actor User = Actor.named("User");

    @Managed
    WebDriver isBrowser;

    @Before
    public void demoUserCanBrowseTheWeb() {
        User.can(BrowseTheWeb.with(isBrowser));
    }
    @Title("Datadriven Test.")
    @Test
    public void browseTheWebAsDemoUser() {
        User.attemptsTo(Open.url("https://parabank.parasoft.com/parabank/")); //opens url
        givenThat(User).attemptsTo(loginSteps.withCredentials(username, password));
    }
}