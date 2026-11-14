package pages;

import com.codeborne.selenide.ElementsCollection;
import utils.BETA_TEST;
import utils.CONSTANTS;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$;

public class AddContactPage extends BETA_TEST {

    public AddContactPage noteAddContact() {
        getElements().addContactNote.shouldHave(text(CONSTANTS.ADD_CONTACT_NOTE));

        return this;

    }

    public AddContactPage clickCancelButton() {
        getElements().cancelButton.click();

        return this;

    }

    public AddContactPage verifyCancelEnabled() {
        getElements().cancelButton.shouldBe(enabled);

        return this;

    }

    public AddContactPage checkMainWords() {
        ElementsCollection headersLabel = $$("label");
        headersLabel.shouldHave(exactTexts(CONSTANTS.ADD_CONTACTS_INPUT_DATA));

        return this;

    }

    public AddContactPage checkMainWordsInputs() {
        ElementsCollection headersInput = $$("#add-contact input");
        headersInput.shouldBe(size(11));

        return this;
    }

}

