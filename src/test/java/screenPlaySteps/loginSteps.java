package screenPlaySteps;

//import com.ui.screenplay.pageobject.BStackLoginPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import pageObjects.loginPage;

public class loginSteps implements Task { //login page script

    @Step("{0} enter username and password '#username' '#password")
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Enter.theValue(username).into(loginPage.USERNAME).thenHit(Keys.TAB));
        actor.attemptsTo(Enter.theValue(password).into(loginPage.PASSWORD).thenHit(Keys.TAB));
        actor.attemptsTo(Click.on(loginPage.LOGIN_BTN));
    }

    private String username;
    private String password;

    public loginSteps(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Task withCredentials(String username, String password) {
        return Instrumented
                .instanceOf(loginSteps.class)
                .withProperties(username, password);
    }
}
