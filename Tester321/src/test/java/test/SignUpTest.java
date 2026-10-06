package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.SightUpPage;

public class SignUpTest extends TestBase {



    @DisplayName("Успешная регистрация пользователя с валидными значениями")
    @Test
    void successfulSignUpTest() {

        new SightUpPage()
                .openSignUpPage()
                .clickSignUpButton()
                .noteIsDisolayed()
                .setFirstName("ILYHA")
                .setLastName("JOPICH")
                .setEmail("nik@mail.com")
                .setPassword("SEX");




    }



}
