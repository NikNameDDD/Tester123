package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pages.LoginPage;
import utils.AuthHelper;

public class LoginTest extends TestBase {

    @DisplayName("Успешный логин с валидными данными")
    @Test
    void loginWithValidData() {
        // Авторизуемся с валидными данными
        AuthHelper.login(AuthHelper.VALID_EMAIL, AuthHelper.VALID_PASSWORD);

        // TODO: Добавьте проверку успешного входа. Например:
        // Assertions.assertTrue(new DashboardPage().isUserLoggedIn(), "Пользователь не авторизовался!");
    }

    @ParameterizedTest
    @CsvSource({
            "wrong_password_123, 'Incorrect username or password'",
            " , 'Incorrect username or password'",
            "invalidPassword, 'Incorrect username or password'"
    })
    @DisplayName("Неуспешный логин с невалидным паролем")
    void loginWithInvalidPassword(
            String invalidPassword,
            String expectedErrorMessage
    ) {

        AuthHelper.login(AuthHelper.VALID_EMAIL, invalidPassword);

        Assertions.assertTrue(
                loginPage.errorMessageIsDisplayed(),
                "Сообщение об ошибке не отобразилось!"
        );

        Assertions.assertEquals(
                expectedErrorMessage,
                loginPage.getErrorMessageText()
        );
    }
}
