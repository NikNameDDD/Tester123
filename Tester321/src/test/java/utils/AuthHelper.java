package utils;

import pages.LoginPage;

public class AuthHelper {


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