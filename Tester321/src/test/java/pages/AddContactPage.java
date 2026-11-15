package pages;


import utils.BETA_TEST;
import utils.CONSTANTS;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.*;


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
        getElements().cancelButton.shouldBe(visible, enabled);

        return this;

    }

    public AddContactPage checkMainWords() {
        getElements().headersLabel.shouldHave(exactTexts(CONSTANTS.ADD_CONTACTS_INPUT_DATA));

        return this;

    }

    public AddContactPage checkMainWordsInputs() {
        getElements().headersInput.shouldBe(size(11));

        return this;

    }

    public AddContactPage verifySubmitButtonEnabled() {
        getElements().submitButton.shouldBe(visible, enabled);

        return this;
    }

    //----------------------------------------------------------------------------------------------------------------

    public AddContactPage inputFirstNameForAddContact(String value) {
        getElements().firstNameInput.setValue(value);

        return this;

    }

    public AddContactPage inputLastNameForAddContact(String value) {
        getElements().lastNameInput.setValue(value);

        return this;

    }


    public AddContactPage inputDateOfBirthForAddContact(String value) {
        getElements().dateOfBirthInput.setValue(value);

        return this;

    }

    public AddContactPage inputMailForAddContact(String value) {
        getElements().emailInput.setValue(value);

        return this;

    }

    public AddContactPage inputPhoneForAddContact(String value) {
        getElements().phoneInput.setValue(value);

        return this;

    }

    public AddContactPage inputStreetAddressOneForAddContact(String value) {
        getElements().streetAddressOneInput.setValue(value);

        return this;

    }

    public AddContactPage inputStreetAddressTwoForAddContact(String value) {
        getElements().streetAddressTwoInput.setValue(value);

        return this;

    }

    public AddContactPage inputCityForAddContact(String value) {
        getElements().cityInput.setValue(value);

        return this;

    }

    public AddContactPage inputStateOfProvinceForAddContact(String value) {
        getElements().stateOfProvinceInput.setValue(value);

        return this;

    }

    public AddContactPage inputPostalCodeForAddContact(String value) {
        getElements().postalCodeInput.setValue(value);

        return this;

    }

    public AddContactPage inputCountryAddContact(String value) {
        getElements().countryInput.setValue(value);

        return this;

    }

    public AddContactPage clickSubmitButton() {
        getElements().submitButton.click();

        return this;

    }

    public boolean errorMessageIsDisplayed() {
        return getElements().errorMessage.shouldBe(visible).isDisplayed();

    }



}

