package utils;

import pages.LoginPage;
import test.TestBase;

public class AuthHelper {

    private final LoginPage loginPage;

    public AuthHelper(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

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