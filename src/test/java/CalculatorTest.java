
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void additionTest() {
        // given
        int a = 2;
        int b = 3;

        // when
        int result = a + b;

        // then
        assertEquals(5, result);
    }

    @Test
    public void substractionTest() {
        // given
        int a = 2;
        int b = 3;

        // when
        int result = a - b;

        // then
        assertEquals(-1, result);
    }

    @Test
    public void multiplicationTest() {
        // given
        int a = 2;
        int b = 3;

        // when
        int result = a * b;

        // then
        assertEquals(6, result);
    }

    @Test
    public void divisionTest() {
        // given
        int a = 3;
        int b = 2;

        // when
        int result = a / b;

        // then
        assertEquals(1, result);
    }
}
