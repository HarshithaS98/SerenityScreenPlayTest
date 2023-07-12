package pageObjects;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class homePage extends PageObject {

    public static final Target accountOverview = Target.the("Accounts Overview")
            .locatedBy("//*[@id=\"rightPanel\"]/div/div/h1"); //locator for accountoverview title in home page

    public static final Target HOME_BUTTON = Target.the("Home Button")
            .locatedBy("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a"); //locator for home button


    public static final Target TRANSFER_FUNDS_BUTTON = Target.the("Transfer Funds Button")
            .locatedBy("//*[@id=\"rightPanel\"]/ul[1]/li[3]/a"); //locator for trnnsfer funds button

   public static final Target WITHDRAW_FUNDS_BUTTON = Target.the("Transfer Funds Button")
           .locatedBy("//*[@id=\"rightPanel\"]/ul[1]/li[3]/a"); //locator for withdrawfunds button
}