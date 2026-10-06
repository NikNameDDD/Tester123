package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.ContactDetailsPage;
import utils.AuthHelper;

public class ContactDetailsTest extends TestBase {



    @DisplayName("Успешная авторизация")
    @BeforeEach
    void LoginHelp() {
        AuthHelper.login(AuthHelper.VALID_EMAIL, AuthHelper.VALID_PASSWORD);
    }


    @DisplayName("Проверка наличия полей и кнопок на странице с данным о контакте")
    @Test
    void checkingButtonsAndLabelOnPage() {
        new ContactDetailsPage()
                .clickOnAnyDataLine()
                .noteBiGNOteOnfoter()
                .SUPERTEST();

    }
}
