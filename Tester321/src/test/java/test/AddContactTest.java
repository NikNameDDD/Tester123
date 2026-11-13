package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import utils.AuthHelper;

public class AddContactTest extends TestBase {

    @DisplayName("Успешная авторизация")
    @BeforeEach
    void LoginHelp() {
        AuthHelper.login(AuthHelper.VALID_EMAIL, AuthHelper.VALID_PASSWORD);
    }


}
