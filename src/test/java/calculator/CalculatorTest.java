package calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void additionTest() {
        // given
        int a = 5;
        int b = 3;

        // when
        int result = calculator.addition(a, b);

        // then
        Assert.assertEquals(8, result);
    }

    @Test
    public void substractionTest() {
        // given
        int a = 5;
        int b = 3;

        // when
        int result = calculator.substraction(a, b);

        // then
        Assert.assertEquals(2, result);
    }

    @Test
    public void multiplicationTest() {
        // given
        int a = 2;
        int b = 3;

        // when
        int result = calculator.multiplication(a, b);

        // then
        Assert.assertEquals(6, result);
    }

    @Test
    public void divisionTest() {
        // given
        int a = 3;
        int b = 2;

        // when
        int result = calculator.division(a, b);

        // then
        Assert.assertEquals(1, result);
    }

    private void additionParametrizedTest(int a, int b, int expected) {
        int result = calculator.addition(a, b);
        Assert.assertEquals(result, expected);
    }
}
