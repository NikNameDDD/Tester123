package pages;

import com.codeborne.selenide.ElementsCollection;
import locators.SelenideElements;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class ContactListPage {

    private final String CLICK_ON_ANY_CONTACT_NOTE = "Click on any contact" +
            " to view the Contact Details";

    private final String[] EXPECTED_HEADERS = {
            "Name",
            "Birthdate",
            "Email",
            "Phone",
            "Address",
            "City, State/Province, Postal Code",
            "Country"};

    private SelenideElements elements = new SelenideElements();


    public ContactListPage checkNoteClickOnAnyContact() {
        elements.ckickOnAnyContact.shouldHave(text(CLICK_ON_ANY_CONTACT_NOTE));

        return this;
    }

    public ContactListPage checkingForExistenceTable() {
        elements.columsInformation.isDisplayed();

        return this;
    }

    public ContactListPage checkingColumsList() {
        ElementsCollection headers = $$("tr th");
        headers.shouldHave(exactTexts(EXPECTED_HEADERS));

        return this;
    }
}




