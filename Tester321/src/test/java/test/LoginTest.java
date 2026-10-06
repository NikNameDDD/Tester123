package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
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

    @DisplayName("Неуспешный логин с невалидным паролем")
    @Test
    void loginWithInvalidPassword() {
        String invalidPassword = "wrong_password_123";

        // Пытаемся войти с неверным паролем
        LoginPage loginPage = AuthHelper.login(AuthHelper.VALID_EMAIL, invalidPassword);

        // Проверяем, что отображается сообщение об ошибке
        // Предполагается, что в LoginPage есть метод errorMessageIsDisplayed() или getErrorMessageText()
        //Assertions.assertTrue(loginPage.errorMessageIsDisplayed(),
        //        "Сообщение об ошибке при неверном пароле не отобразилось!");

        // Альтернативный вариант с проверкой текста (если метод возвращает String):
        // Assertions.assertEquals("Неверный логин или пароль", loginPage.getErrorMessageText());
    }
}
