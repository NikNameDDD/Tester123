package utils;

import pages.LoginPage;

public class AuthHelper {

    public static void login() {
        new LoginPage()
                .openPage()
                .setEmail("niknamed300@mail.ru")
                .setPassword("nikitax57N123!")
                .submitButtonIsDisplayed()
                .submitButtonClick();

    }
}