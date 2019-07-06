package calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Rule
    public ExpectedException expectException = ExpectedException.none();

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
        double result = calculator.division(a, b);

        // then
        Assert.assertEquals(1, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divisionByZeroTest() {
        // given
        int a = 3;
        int b = 0;

        // when
        double result = calculator.division(a, b);

        // then
        // throw exception
    }

    @Test
    public void divisionFirstValueNullPointerTest() {
        // given
        Integer a = null;
        int b = 5;

        // when
        try {
            double result = calculator.division(a, b);
            assert false;
        } catch (IllegalArgumentException exception) {
            Assert.assertEquals("Cannot divide by zero.", exception.getMessage());
            assert true;
        }
    }

    @Test
    public void divisionSecondValueNullPointerTest() {
        // given
        Integer a = 5;
        Integer b = null;
        expectException.expect(IllegalArgumentException.class);

        // when
        double result = calculator.division(a, b);

        // then
        // throw exception
    }
}
