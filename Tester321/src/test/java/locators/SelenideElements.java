package locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class SelenideElements {

    public SelenideElement
            signUpButtonPress = $("#signup"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#email"),
            passwordInput = $("#password"),
            noteDisplayed = $x("//div/p[1]"),
            submitButton = $("#submit"),
            ckickOnAnyContact = $x("//div/p[1]"),
            columsInformation = $("#contactTableHead");




}
