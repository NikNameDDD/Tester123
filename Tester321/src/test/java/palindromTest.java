import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class palindromTest {
    @Test
    void testPal() {
        String word = "level";

        String reversed = new StringBuilder(word).reverse().toString();
        assertEquals(word, reversed, "Должно быть гуд");

    }
}
