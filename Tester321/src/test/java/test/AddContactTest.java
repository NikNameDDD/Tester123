package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pages.AddContactPage;
import pages.ContactListPage;
import utils.AuthHelper;
import utils.CONSTANTS;

import java.util.stream.Stream;

public class AddContactTest extends TestBase {

    @DisplayName("Успешная авторизация")
    @BeforeEach
    void LoginHelp() {
        AuthHelper.login(CONSTANTS.VALID_EMAIL, CONSTANTS.VALID_PASSWORD);
    }

    @DisplayName("Отмена создания контакта и повторное открытие формы")
    @Test
    void checkAddContactPage() {
        new ContactListPage()
                .verifyAddNewContactButtonEnabled()
                .clickAddNewContact();
        new AddContactPage()
                .noteAddContact()
                .verifySubmitButtonEnabled()
                .verifyCancelEnabled()
                .clickCancelButton();
        new ContactListPage()
                .verifyAddNewContactButtonEnabled()
                .clickAddNewContact();
        new AddContactPage()
                .verifySubmitButtonEnabled()
                .verifyCancelEnabled()
                .checkMainWords()
                .checkMainWordsInputs();
    }


    @ParameterizedTest(name = "{0}")
    @MethodSource("addContactInputsInvalid")
    @DisplayName("Негативная проверка добавления контакта")
    void failedAddContactTest(
            String scenario,
            String firstName,
            String lastName,
            String dateOfBirth,
            String email,
            String phone,
            String streetAddress1,
            String streetAddress2,
            String city,
            String stateOfProvince,
            String postalCode,
            String country
    ) {
        new ContactListPage()
                .clickAddNewContact();

        AddContactPage addContactPage = new AddContactPage()
                .verifySubmitButtonEnabled()
                .verifyCancelEnabled()
                .inputFirstNameForAddContact(firstName)
                .inputLastNameForAddContact(lastName)
                .inputDateOfBirthForAddContact(dateOfBirth)
                .inputMailForAddContact(email)
                .inputPhoneForAddContact(phone)
                .inputStreetAddressOneForAddContact(streetAddress1)
                .inputStreetAddressTwoForAddContact(streetAddress2)
                .inputCityForAddContact(city)
                .inputStateOfProvinceForAddContact(stateOfProvince)
                .inputPostalCodeForAddContact(postalCode)
                .inputCountryAddContact(country)
                .clickSubmitButton();

        Assertions.assertTrue(
                addContactPage.errorMessageIsDisplayed(),
                "Не отображается сообщение об ошибке: " + scenario
        );
    }

    static Stream<Arguments> addContactInputsInvalid() {
        return Stream.of(
                Arguments.of(
                        "Пустые First Name и Last Name",
                        "", "", "1995-05-15", "ivan@mail.com", "8005553535", "Lenina 1", "Apt 10", "Minsk", "Minskaya", "220000", "Belarus"
                ),
                Arguments.of(
                        "Пустые First Name и Date of Birth",
                        "", "Ivanov", "", "ivan@mail.com", "8005553535", "Lenina 1", "Apt 10", "Minsk", "Minskaya", "220000", "Belarus"
                ),
                Arguments.of(
                        "Пустые First Name и Email",
                        "", "Ivanov", "1995-05-15", "", "8005553535", "Lenina 1", "Apt 10", "Minsk", "Minskaya", "220000", "Belarus"
                ),
                Arguments.of(
                        "Пустые First Name и Phone",
                        "", "Ivanov", "1995-05-15", "ivan@mail.com", "", "Lenina 1", "Apt 10", "Minsk", "Minskaya", "220000", "Belarus"
                ),
                Arguments.of(
                        "Пустые First Name и Street Address 1",
                        "", "Ivanov", "1995-05-15", "ivan@mail.com", "8005553535", "", "Apt 10", "Minsk", "Minskaya", "220000", "Belarus"
                ),
                Arguments.of(
                        "Пустые First Name и Street Address 2",
                        "", "Ivanov", "1995-05-15", "ivan@mail.com", "8005553535", "Lenina 1", "", "Minsk", "Minskaya", "220000", "Belarus"
                ),
                Arguments.of(
                        "Пустые Last Name и City",
                        "Ivan", "", "1995-05-15", "ivan@mail.com", "8005553535", "Lenina 1", "Apt 10", "", "Minskaya", "220000", "Belarus"
                ),
                Arguments.of(
                        "Пустые Last Name и State or Province",
                        "Ivan", "", "1995-05-15", "ivan@mail.com", "8005553535", "Lenina 1", "Apt 10", "Minsk", "", "220000", "Belarus"
                ),
                Arguments.of(
                        "Пустые Last Name и Postal Code",
                        "Ivan", "", "1995-05-15", "ivan@mail.com", "8005553535", "Lenina 1", "Apt 10", "Minsk", "Minskaya", "", "Belarus"
                ),
                Arguments.of(
                        "Пустые Last Name и Country",
                        "Ivan", "", "1995-05-15", "ivan@mail.com", "8005553535", "Lenina 1", "Apt 10", "Minsk", "Minskaya", "220000", ""
                ),
                Arguments.of(
                        "Все поля пустые",
                        "", "", "", "", "", "", "", "", "", "", ""
                )
        );
    }
}
