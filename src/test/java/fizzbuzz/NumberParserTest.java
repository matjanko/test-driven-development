package fizzbuzz;

import junit.framework.Assert;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.List;

@RunWith(JUnitParamsRunner.class)
public class NumberParserTest {
    NumberChanger numberChanger;
    NumberParser numberParser;

    @Before
    public void before() {
        numberParser = new NumberParser(new NumberChanger());
    }

    @Test
    @Parameters({
           // need refactor "{{1, 2, 3}, {1, 2, Fizz}}",
    })
    public void changeInputTest(List<Integer> inputList, List<String> listExpected) {
        Assert.assertEquals(listExpected, numberParser.changeInput(inputList));
    }
}