import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class HelloTest {
    @Test
    void HelloTesting() {
        String s1 = "Hello ! ";
        String s2 = "Dude";

        String s3 = s1 + s2;

        assertEquals("Hello ! Dude", s3, "Ожидаем хеллоу dude");
    }
}
