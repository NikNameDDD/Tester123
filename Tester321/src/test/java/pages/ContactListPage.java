package pages;


import utils.BETA_TEST;
import utils.CONSTANTS;


import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.text;


public class ContactListPage extends BETA_TEST {

    public ContactListPage checkNoteClickOnAnyContact() {
        getElements().clickOnAnyContact
                .shouldHave(text(CONSTANTS.CLICK_ON_ANY_CONTACT_NOTE));

        return this;

    }

    public ContactListPage checkingForExistenceTable() {
        getElements().columnsInformation.isDisplayed();

        return this;

    }

    public ContactListPage checkingColumsList() {
        getElements().headersCheckingColumnsList.
                shouldHave(exactTexts(CONSTANTS.EXPECTED_HEADERS));

        return this;

    }

    public ContactListPage logOutClick() {
        getElements().logOutButton.click();

        return this;

    }

    public ContactListPage clickAddNewContact() {
        getElements().addNewContactButton.click();

        return null;

    }

    public ContactListPage verifyaddNewContactButtonEnabled() {
        getElements().addNewContactButton.shouldBe(enabled);

        return this;

    }
}