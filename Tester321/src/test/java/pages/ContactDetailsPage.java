package pages;

import com.codeborne.selenide.ElementsCollection;
import locators.SelenideElements;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class ContactDetailsPage {

    SelenideElements elements = new SelenideElements();

    private final String BIG_NOTE = "Contact Details";

    private final String[] TESTER_TESTER = {
            "First Name:",
            "Last Name:",
            "Date of Birth:",
            "Email:",
            "Phone:",
            "Street Address 1:",
            "Street Address 2:",
            "City:",
            "State or Province:",
            "Postal Code:",
            "Country:"

    };

    public ContactDetailsPage noteBiGNOteOnfoter() {
        elements.contactDetailsBigNote.shouldHave(text(BIG_NOTE));

        return this;
    }

    public ContactDetailsPage clickOnAnyDataLine() {
        elements.dataContactLineInTable.click();

        return this;
    }

    public ContactDetailsPage SUPERTEST() {

        ElementsCollection headers = $$("label");
        headers.shouldHave(exactTexts(TESTER_TESTER));

        return this;

    }

}