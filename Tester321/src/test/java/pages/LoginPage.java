package pages;

import utils.BETA_TEST;
import utils.CONSTANTS;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class LoginPage extends BETA_TEST {


    public LoginPage openPage() {
        open("https://thinking-tester-contact-list.herokuapp.com/");
        $(".welcome-message").shouldHave(text(CONSTANTS.WELCOME_MESSAGE));

        return this;

    }

    public LoginPage setEmail(String value) {
        getElements().emailInput.setValue(value);

        return this;

    }

    public LoginPage setPassword(String value) {
        getElements().passwordInput.setValue(value);

        return this;

    }

    public LoginPage clearEmail() {
        getElements().emailInput.clear();

        return this;

    }

    public LoginPage clearPassword() {
        getElements().passwordInput.clear();

        return this;

    }

    public boolean submitButtonIsDisplayed() {
        return getElements().submitButton.isDisplayed();

    }

    public LoginPage submitButtonClick() {
        getElements().submitButton.click();

        return this;

    }

    public boolean errorMessageIsDisplayed() {
        return getElements().errorMessage.shouldBe(visible).isDisplayed();

    }

    public String getErrorMessageText() {
        return getElements().errorMessage.getText();

    }
}