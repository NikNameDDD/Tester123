package test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.ContactDetailsPage;
import utils.AuthHelper;

public class ContactDetailsTest extends TestBase {



    @DisplayName("Успешная авторизация")
    @BeforeAll
    static void LoginHelp() {
        AuthHelper.login();
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
