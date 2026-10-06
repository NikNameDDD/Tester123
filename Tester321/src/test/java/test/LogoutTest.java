package test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.ContactListPage;
import pages.SightUpPage;
import utils.AuthHelper;

public class LogoutTest extends TestBase {
    private ContactListPage contactListPage;
    private SightUpPage sightUpPage;

    @BeforeEach
    void setUp() {
        AuthHelper.login(AuthHelper.VALID_EMAIL, AuthHelper.VALID_PASSWORD);
        // Инициализируем объекты заново перед каждым тестом
        contactListPage = new ContactListPage();
        sightUpPage = new SightUpPage();
    }

    @Test
    void logoutTest() {
        contactListPage.logOutClick();
        sightUpPage.clickSignUpButtonIsDisplayed();
    }
}