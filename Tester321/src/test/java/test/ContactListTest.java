package test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.ContactListPage;
import utils.AuthHelper;

public class ContactListTest extends TestBase {


    @BeforeAll
    static void LoginHelp() {
        AuthHelper.login();
    }


    @Test
    void CheckNoteTest() {
        new ContactListPage()
                .checkNoteClickOnAnyContact()
                .checkingForExistenceTable()
                .checkingColumsList();
    }

}
