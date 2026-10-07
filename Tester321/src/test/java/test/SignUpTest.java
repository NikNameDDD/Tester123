package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.SightUpPage;

public class SignUpTest extends TestBase {


    @DisplayName("Успешная регистрация пользователя с валидными значениями")
    @Test
    void successfullSignUpTest() {

        String firstName = "ILYHA";
        String lastName = "JOPICH";
        String email = "nik@mail.com";
        String password = "SEXXXXXXXX";

        signUpPage
                .openSignUpPage()
                .clickSignUpButton()
                .noteIsDisolayed()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setPassword(password)
                .clicksubmitButton();

        Assertions.assertTrue(
                () -> signUpPage.successMessageIsDisplayed(),
                "Сообщение об успешной регистрации не отобразилось!");
    }


    @DisplayName("Провальная регистрация пользователя с валидными значениями")
    @Test
    void failedFullSignUpTest() {

        String firstName = "ILYHA";
        String lastName = "JOPICH";
        String email = "nik@mail.com";
        String password = "q";

        signUpPage
                .openSignUpPage()
                .clickSignUpButton()
                .noteIsDisolayed()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setPassword(password)
                .clicksubmitButton();

        Assertions.assertTrue(
                () -> signUpPage.errorMessageIsDisplayed());

    }
}
