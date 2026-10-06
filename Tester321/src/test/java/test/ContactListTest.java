package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.ContactListPage;
import utils.AuthHelper;

public class ContactListTest extends TestBase {


    @BeforeEach
    void LoginHelp() {
        AuthHelper.login(AuthHelper.VALID_EMAIL, AuthHelper.VALID_PASSWORD);
    }


    @Test
    void CheckNoteTest() {
        new ContactListPage()
                .checkNoteClickOnAnyContact()
                .checkingForExistenceTable()
                .checkingColumsList();
    }

}
