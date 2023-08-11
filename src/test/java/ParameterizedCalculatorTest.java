
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedCalculatorTest {


    @ParameterizedTest
    @CsvSource({"3, 5, 8", "0, 0, 0", "-2, 2, 0", "10, -7, 3"})
    void testAddition(int a, int b, int expectedSum) {
        Calculator calculator = new Calculator();
        int result = calculator.add(a, b);
        assertEquals(expectedSum, result);
    }
}
