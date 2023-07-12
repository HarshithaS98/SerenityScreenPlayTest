package pageObjects;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class homePage extends PageObject {

    public static final Target accountOverview = Target.the("Accounts Overview")
            .locatedBy("//*[@id=\"rightPanel\"]/div/div/h1");
}