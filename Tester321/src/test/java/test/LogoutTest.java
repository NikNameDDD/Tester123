package test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.ContactListPage;
import pages.SightUpPage;
import utils.AuthHelper;
import utils.CONSTANTS;

public class LogoutTest extends TestBase {
    private ContactListPage contactListPage;
    private SightUpPage sightUpPage;

    @BeforeEach
    void setUp() {
        AuthHelper.login(CONSTANTS.VALID_EMAIL, CONSTANTS.VALID_PASSWORD);

        contactListPage = new ContactListPage();
        sightUpPage = new SightUpPage();
    }

    @Test
    void logoutTest() {
        contactListPage.logOutClick();
        sightUpPage.clickSignUpButtonIsDisplayed();
    }
}