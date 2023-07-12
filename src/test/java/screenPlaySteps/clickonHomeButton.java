package screenPlaySteps;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import pageObjects.homePage;

public class clickonHomeButton implements Task { //for clicking home button script
    public static clickonHomeButton named() {
        return new clickonHomeButton();
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(homePage.HOME_BUTTON)
        );
    }
}