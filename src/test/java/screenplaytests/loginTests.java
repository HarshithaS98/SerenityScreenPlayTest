package screenplaytests;
import Questions.que;
import screenPlaySteps.loginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class loginTests {

    private Actor User = Actor.named("User");

    @Managed
    private WebDriver isBrowser;

    @Before
    public void demoUserCanBrowseTheWeb(){
        User.can(BrowseTheWeb.with(isBrowser));
    }

    @Test
    public void browseTheWebAsDemoUser(){
        User.attemptsTo(Open.url("https://parabank.parasoft.com/parabank/"));
        givenThat(User).attemptsTo(loginSteps.withCredentials("RosieW", "222222"));
        then(User).should(seeThat(que.displayed(), CoreMatchers.equalTo("Accounts Overview")));
    }

}