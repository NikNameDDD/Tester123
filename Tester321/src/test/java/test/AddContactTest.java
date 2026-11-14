package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.AddContactPage;
import pages.ContactListPage;
import utils.AuthHelper;
import utils.CONSTANTS;

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
                .verifyaddNewContactButtonEnabled()
                .clickAddNewContact();
        new AddContactPage()
                .noteAddContact()
                .verifyCancelEnabled()
                .clickCancelButton();
        new ContactListPage()
                .verifyaddNewContactButtonEnabled()
                .clickAddNewContact();
        new AddContactPage()
                .checkMainWords()
                .checkMainWordsInputs();
    }


}
