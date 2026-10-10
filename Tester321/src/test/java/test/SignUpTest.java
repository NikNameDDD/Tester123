package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class SignUpTest extends TestBase {

    @Test
    @DisplayName("Успешная регистрация пользователя с валидными значениями")
    void successfulSignUpTest() {
        signUpPage
                .openSignUpPage()
                .clickSignUpButton()
                .noteIsDisolayed()
                .setFirstName("ILYHA")
                .setLastName("JOPICH")
                .setEmail("nik@mail.com")
                .setPassword("SEXXXXXXXX")
                .clicksubmitButton();

        Assertions.assertTrue(
                signUpPage.successMessageIsDisplayed(),
                "Сообщение об успешной регистрации не отобразилось!"
        );
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("invalidSignUpData")
    @DisplayName("Регистрация с невалидными данными")
    void failedSignUpTest(
            String scenario,
            String firstName,
            String lastName,
            String email,
            String password
    ) {
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
                signUpPage.errorMessageIsDisplayed(),
                "Не отобразилось сообщение об ошибке: " + scenario
        );
    }

    static Stream<Arguments> invalidSignUpData() {
        return Stream.of(
                Arguments.of(
                        "Пустой пароль",
                        "ILYHA", "JOPICH", "nik@mail.com", ""
                ),
                Arguments.of(
                        "Пустой email",
                        "ILYHA", "JOPICH", " ", "qqqqqqqq"
                ),
                Arguments.of(
                        "Пустая фамилия",
                        "ILYHA", " ", "nik@mail.com", "qqqqqqqq"
                ),
                Arguments.of(
                        "Пустое имя",
                        " ", "JOPICH", "nik@mail.com", "qqqqqqqq"
                )
        );
    }
}