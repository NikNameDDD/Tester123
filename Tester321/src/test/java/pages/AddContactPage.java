package pages;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import test.TestBase;
import utils.AuthHelper;
import utils.BETA_TEST;
import utils.CONSTANTS;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.text;

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








}
