package Questions;

//import com.ui.screenplay.pageobject.BstackDashboardPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pageObjects.homePage;

public class que implements Question<String> {

    public static Question<String> displayed() {
        return new que();
    }

    public String answeredBy(Actor actor) {
        return Text.of(homePage.accountOverview).answeredBy(actor);
    }
}
