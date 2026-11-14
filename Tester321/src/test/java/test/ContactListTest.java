package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.ContactListPage;
import utils.AuthHelper;
import utils.CONSTANTS;

public class ContactListTest extends TestBase {


    @BeforeEach
    void LoginHelp() {
        AuthHelper.
                login(CONSTANTS.VALID_EMAIL,CONSTANTS.VALID_PASSWORD);
    }


    @Test
    void CheckNoteTest() {
        new ContactListPage()
                .checkNoteClickOnAnyContact()
                .checkingForExistenceTable()
                .checkingColumsList();
    }

}
