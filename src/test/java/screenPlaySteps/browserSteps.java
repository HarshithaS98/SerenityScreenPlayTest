package screenPlaySteps;

import pageObjects.loginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class browserSteps implements Task {
    public static browserSteps loginPage() {
        return instrumented(browserSteps.class);
    }

    loginPage LoginPage;

    @Step("{0} access Login page")
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(Open.browserOn().the(LoginPage));
    }
}