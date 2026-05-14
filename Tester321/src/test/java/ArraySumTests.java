import org.junit.jupiter.api.Test;

public class ArraySumTests {

    @Test
    void ArraySumTester() {
        int number[] = {1,2,3,4,5};
        int sum = 0;

        for (int num: number) {
            sum += num;
        } 
    }
}
