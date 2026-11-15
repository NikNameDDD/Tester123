package test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.AddContactPage;
import pages.ContactListPage;
import pages.LoginPage;
import pages.SightUpPage;


public class TestBase {

    protected SightUpPage signUpPage = new SightUpPage();

    protected LoginPage loginPage = new LoginPage();

    protected AddContactPage addContactPage = new AddContactPage();

    protected ContactListPage contactListPage = new ContactListPage();

    @BeforeAll
    static void BeforeAll() {

        Configuration.baseUrl = "https://thinking-tester-contact-list." +
                "herokuapp.com/";
        Configuration.browserSize = "1920x1080";

    }
}
