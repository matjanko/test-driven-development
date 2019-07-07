package fizzbuzz;

import junit.framework.Assert;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class NumberChangerTest {
    NumberChanger numberChanger;

    @Before
    public void before() {
        numberChanger = new NumberChanger();
    }

    @Test
    @Parameters({
            "1, 1",
            "3, Fizz",
            "5, Buzz",
            "15, FizzBuzz",
    })
    public void changeNumberTest(int input, String expected) {
        Assert.assertEquals(expected, numberChanger.changeNumber(input));
    }
}
