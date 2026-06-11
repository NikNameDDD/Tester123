package pages;

import locators.SelenideElements;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class LoginPage {


    private final String WELCOME_MESSAGE =
            "Welcome! This application is for testing purposes only." +
                    " The database will be purged as needed to keep costs down.";

    private SelenideElements elements = new SelenideElements();


    public LoginPage openPage() {

        open("https://thinking-tester-contact-list.herokuapp.com/");
        $(".welcome-message").shouldHave(text(WELCOME_MESSAGE));
//        executeAsyncJavaScript("$('#fixedban').remove()");
//        executeAsyncJavaScript("$('#foter').remove()");

        return this;
    }

    public LoginPage setEmail(String value) {
        elements.emailInput.setValue(value);

        return this;
    }

    public LoginPage setPassword(String value) {
        elements.passwordInput.setValue(value);

        return this;
    }

    public LoginPage clearEmail() {
        elements.emailInput.clear();

        return this;
    }

    public LoginPage clearPassword() {
        elements.passwordInput.clear();

        return this;
    }

    public LoginPage submitButtonIsDisplayed() {
        elements.submitButton.isDisplayed();

        return this;
    }

    public LoginPage submitButtonClick() {
        elements.submitButton.click();

        return this;
    }
}
