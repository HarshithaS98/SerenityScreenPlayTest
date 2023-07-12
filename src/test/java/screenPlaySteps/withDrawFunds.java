package screenPlaySteps;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import pageObjects.homePage;

public class withDrawFunds implements Task {

    public static transferFunds named() { //withdraw funds button script
        return new transferFunds();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(homePage.WITHDRAW_FUNDS_BUTTON )
        );
    }
}

