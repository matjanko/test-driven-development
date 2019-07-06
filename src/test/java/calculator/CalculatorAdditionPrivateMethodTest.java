package calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorAdditionPrivateMethodTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void additionTest() {
        additionParametrizedTest(5,5,10);
        additionParametrizedTest(21, 1,22);
        additionParametrizedTest(3,18,21);
    }

    private void additionParametrizedTest(int a, int b, int expected) {
        int result = calculator.addition(a, b);
        Assert.assertEquals(result, expected);
    }
}
