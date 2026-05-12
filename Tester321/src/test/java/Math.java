import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class Math {



    @Test
    void testAdd() {
        int a = 1;
        int b = 2;
        int sum = a + b;
        assertEquals(3, sum, "должно быть 5" );
    }
}
