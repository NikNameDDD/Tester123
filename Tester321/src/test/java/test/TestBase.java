package test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.LoginPage;

public class TestBase {
    @BeforeAll
    static void BeforeAll() {

        LoginPage loginPage = new LoginPage();

        Configuration.baseUrl = "https://thinking-tester-contact-list." +
                "herokuapp.com/";
        Configuration.browserSize = "1920x1080";


    }
}
