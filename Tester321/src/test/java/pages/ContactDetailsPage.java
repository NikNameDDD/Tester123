package pages;

import utils.BETA_TEST;
import utils.CONSTANTS;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Condition.*;

public class ContactDetailsPage extends BETA_TEST {


    public ContactDetailsPage noteBigNoteOnFooter() {
        getElements().contactDetailsBigNote
                .shouldHave(text(CONSTANTS.CONTACT_DETAILS_BIG_NOTE));

        return this;

    }

    public ContactDetailsPage clickOnAnyDataLine() {
        getElements().dataContactLineInTable.click();

        return this;

    }


    public ContactDetailsPage contactDetailsCheck() {
        getElements().headersContactDetailsCheck
                .shouldHave(exactTexts(CONSTANTS.CONTACT_DETAILS_CHECK));

        return this;

    }


    public ContactDetailsPage verifyEditContactButton() {
        getElements().editContactButton.shouldBe(visible, enabled);

        return this;

    }

    public ContactDetailsPage verifyDeleteButton() {
        getElements().deleteContactButton.shouldBe(visible, enabled);

        return this;

    }

    public ContactDetailsPage verifyReturnToContactButton() {
        getElements().returnToContactButton.shouldBe(visible, enabled);

        return this;

    }

    public ContactDetailsPage verifyLogOutButton() {
        getElements().logOutButton.shouldBe(visible, enabled);

        return this;

    }

}