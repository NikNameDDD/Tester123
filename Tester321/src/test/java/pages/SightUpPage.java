package pages;

import locators.SelenideElements;
import utils.BETA_TEST;
import utils.CONSTANTS;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class SightUpPage extends BETA_TEST {


    public SightUpPage openSignUpPage() {
        open("https://thinking-tester-contact-list.herokuapp.com/");

        return this;

    }

    public SightUpPage clickSignUpButton() {
        getElements().signUpButtonPress.click();

        return this;

    }

    public SightUpPage clicksubmitButton() {
        getElements().submitButton.click();

        return this;

    }

    public SightUpPage noteIsDisolayed() {
        getElements().noteDisplayed.shouldHave(text(CONSTANTS.SIGH_UP_MESSAGE));

        return this;

    }

    public SightUpPage setFirstName(String value) {
        getElements().firstNameInput.setValue(value);

        return this;

    }

    public SightUpPage setLastName(String value) {
        getElements().lastNameInput.setValue(value);

        return this;

    }

    public SightUpPage setEmail(String value) {
        getElements().emailInput.setValue(value);

        return this;

    }

    public SightUpPage setPassword(String value) {
        getElements().passwordInput.setValue(value);

        return this;

    }

    public SightUpPage clickSignUpButtonIsDisplayed() {
        getElements().signUpButtonPress.isDisplayed();

        return this;

    }

    public boolean successMessageIsDisplayed() {
        return getElements().addNewContactButton.shouldBe(visible).isDisplayed();

    }

    public boolean errorMessageIsDisplayed() {
        return getElements().errorMessage.shouldBe(visible).isDisplayed();

    }
}