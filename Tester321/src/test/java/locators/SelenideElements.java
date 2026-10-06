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
            noteDisplayed = $x("//p[contains(text(), 'Sign up to begin')]"),
            submitButton = $("#submit"),
            ckickOnAnyContact = $x("//div/p[1]"),
            dataContactLineInTable = $x("//*[@id='myTable']/tr"),
            contactDetailsBigNote = $x("//h1[text() = 'Contact Details']"),
            //columsList = $("tr th"),
            labelElementsOnCotactDetailsPage = $("label"),
            logOutButton = $("#logout"),
            columsInformation = $("#contactTableHead");




}
