package pages;

import locators.SelenideElements;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class SightUpPage {

    private final String SIGH_UP_MESSAGE =
            "Sign up to begin adding your contacts!";

    private SelenideElements elements = new SelenideElements(); //тут я создал экземпляр класса


    public SightUpPage openSignUpPage() {
        open("https://thinking-tester-contact-list.herokuapp.com/");

        return this;
    }


    public SightUpPage clickSignUpButton() {
        elements.signUpButtonPress.click();

        return this;

    }

    public SightUpPage clicksubmitButton() {
        elements.submitButton.click();

        return this;

    }

    public SightUpPage noteIsDisolayed() {
        elements.noteDisplayed.shouldHave(text(SIGH_UP_MESSAGE));

        return this;
    }

    public SightUpPage setFirstName(String value) {
        elements.firstNameInput.setValue(value);

        return this;
    }

    public SightUpPage setLastName(String value) {
        elements.lastNameInput.setValue(value);

        return this;
    }

    public SightUpPage setEmail(String value) {
        elements.emailInput.setValue(value);

        return this;
    }

    public SightUpPage setPassword(String value) {
        elements.passwordInput.setValue(value);

        return this;
    }

    public SightUpPage clickSignUpButtonIsDisplayed() {
        elements.signUpButtonPress.isDisplayed();

        return this;

    }

    public boolean successMessageIsDisplayed() {
        return elements.addNewContactButton.shouldBe(visible).isDisplayed();
    }

    public boolean errorMessageIsDisplayed() {
        return elements.errorMessage.shouldBe(visible).isDisplayed();
    }
}