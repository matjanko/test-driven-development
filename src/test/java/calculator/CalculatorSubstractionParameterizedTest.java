package calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class CalculatorSubstractionParameterizedTest {

    int a;
    int b;
    int expected;

    public CalculatorSubstractionParameterizedTest(int a, int b, int expected) {
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

    @Test
    public void substractionTest() {
        int result = calculator.substraction(a, b);
        Assert.assertEquals(expected, result);
    }
}
