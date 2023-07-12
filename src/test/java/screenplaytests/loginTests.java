package screenplaytests;
import Questions.que;
import screenPlaySteps.clickonHomeButton;
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
import screenPlaySteps.transferFunds;
import screenPlaySteps.withDrawFunds;

@RunWith(SerenityRunner.class)
public class loginTests {  //Complete tests

    private Actor User = Actor.named("User");

    @Managed
    WebDriver isBrowser;

    @Before
    public void demoUserCanBrowseTheWeb(){
        User.can(BrowseTheWeb.with(isBrowser));
    }

    @Test
    public void browseTheWebAsDemoUser(){
        User.attemptsTo(Open.url("https://parabank.parasoft.com/parabank/")); //opens url
        givenThat(User).attemptsTo(loginSteps.withCredentials("RosieW", "222222")); //enter credentials
        then(User).should(seeThat(que.displayed(), CoreMatchers.equalTo("Accounts Overview"))); //validating with title in homepage

        User.attemptsTo(clickonHomeButton.named()); //  Click on the "Home" button

        User.attemptsTo(transferFunds.named());//  Click on the "Transfer Funds" button
        User.attemptsTo(Open.url("https://parabank.parasoft.com/parabank/"));//opens url
        User.attemptsTo(withDrawFunds.named()); // click on withdrawfunds button

    }

}