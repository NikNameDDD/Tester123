package pages;

import com.codeborne.selenide.ElementsCollection;
import utils.BETA_TEST;
import utils.CONSTANTS;


import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class ContactListPage extends BETA_TEST {

    public ContactListPage checkNoteClickOnAnyContact() {

        getElements().ckickOnAnyContact.shouldHave(text(CONSTANTS.CLICK_ON_ANY_CONTACT_NOTE));

        return this;

    }

    public ContactListPage checkingForExistenceTable() {

        getElements().columsInformation.isDisplayed();

        return this;

    }

    public ContactListPage checkingColumsList() {

        ElementsCollection headers = $$("tr th");
        headers.shouldHave(exactTexts(CONSTANTS.EXPECTED_HEADERS));

        return this;

    }

    public ContactListPage logOutClick() {

        getElements().logOutButton.click();

        return this;

    }

    public ContactListPage clickAddNewContact() {

        return null;
    }

}