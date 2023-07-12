package screenPlaySteps;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import pageObjects.homePage;

public class transferFunds implements Task {

    public static transferFunds named() {  // transferfunds button script
        return new transferFunds();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(homePage.TRANSFER_FUNDS_BUTTON)
        );
    }
}
