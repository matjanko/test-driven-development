package calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class CalculatorTest {

    int a;
    int b;
    int expected;

    public CalculatorTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "input{0} - {1} = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {2, 1, 1}, {5, 3, 2}, {7, 4, 3}
        });
    }

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }
/*

    @Test
    public void additionTest() {
        additionParametrizedTest(5,5,10);
        additionParametrizedTest(21, 1,22);
        additionParametrizedTest(3,18,21);
    }
*/

    @Test
    public void substractionTest() {
        int result = calculator.substraction(a, b);
        Assert.assertEquals(expected, result);
    }
/*
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
        int result = calculator.substraction(a, b);

        // then
        Assert.assertEquals(1, result);
    }

    private void additionParametrizedTest(int a, int b, int expected) {
        int result = calculator.addition(a, b);
        Assert.assertEquals(result, expected);
    }*/
}
