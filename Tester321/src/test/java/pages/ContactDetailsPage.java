package pages;

import com.codeborne.selenide.ElementsCollection;
import utils.BETA_TEST;
import utils.CONSTANTS;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class ContactDetailsPage extends BETA_TEST {


    public ContactDetailsPage noteBiGNOteOnfoter() {
        getElements().contactDetailsBigNote.shouldHave(text(CONSTANTS.CONTACT_DETAILS_BIG_NOTE));

        return this;
    }

    public ContactDetailsPage clickOnAnyDataLine() {
        getElements().dataContactLineInTable.click();

        return this;
    }

    public ContactDetailsPage contactDetailsChech() {

        ElementsCollection headers = $$("label");
        headers.shouldHave(exactTexts(CONSTANTS.CONTACT_DETAILS_CHECK));

        return this;

    }

}