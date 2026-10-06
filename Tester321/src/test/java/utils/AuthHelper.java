package utils;

import pages.LoginPage;

public class AuthHelper {

    // Выносим валидные учетные данные в константы
    public static final String VALID_EMAIL = "niknamed300@mail.ru";
    public static final String VALID_PASSWORD = "nikitax57N123!";

    // Метод стал универсальным и принимает любые данные
    public static LoginPage login(String email, String password) {
        LoginPage loginPage = new LoginPage();

        loginPage.openPage()
                .setEmail(email)
                .setPassword(password);

        if (loginPage.submitButtonIsDisplayed()) {
            loginPage.submitButtonClick();
        } else {
            throw new IllegalStateException("Кнопка отправки формы не отображается!");
        }

        return loginPage;
    }
}