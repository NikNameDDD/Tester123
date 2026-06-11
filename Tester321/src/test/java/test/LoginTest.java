package test;

import org.junit.jupiter.api.Test;
import pages.LoginPage;
import utils.AuthHelper;


public class LoginTest extends TestBase {

    @Test
    void Log_in() {
        AuthHelper.login();
    }
}
