package test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.SightUpPage;


public class TestBase {

    protected SightUpPage signUpPage = new SightUpPage();

    @BeforeAll
    static void BeforeAll() {

        Configuration.baseUrl = "https://thinking-tester-contact-list." +
                "herokuapp.com/";
        Configuration.browserSize = "1920x1080";

    }
}
