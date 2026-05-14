import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class LoginTest {


    @Test
    void successfulLoginTest() {
        open("https://thinking-tester-contact-list.herokuapp.com/");

        $("h1").shouldHave(
                text("Contact List App"));

        $("[id=email]").setValue("niknamed300@mail.ru");
        $("[id=password]").setValue("nikitax57N123!").pressEnter();

        $("h1").shouldHave(text("Contact List"));

    }


    @Test
    void unsuccessfulLoginTest() {

    }
}
