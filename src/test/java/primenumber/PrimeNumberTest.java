package primenumber;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

@RunWith(JUnitParamsRunner.class)
public class PrimeNumberTest {
    PrimeNumber primeNumber;

    @Before
    public void before() {
        primeNumber = new PrimeNumber();
    }

    @Test
    @Parameters({
            "6, 2, 3, 5",
            "2, 2",
            "4, 2, 3",
            "8, 2, 3, 5, 7"
    })
    public void getPrimeNumberTest(String... args) {
        int range = Integer.parseInt(args[0]);
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i < args.length; i++)
            list.add(Integer.parseInt(args[i]));

        Assert.assertEquals(list, primeNumber.getPrimeNumbers(range));
    }

    @Test
    @Parameters ({
            "1",
            "2",
            "30",
            "60",
    })
    public void getPrimeNumberMinValueTest(int range) {
        try {
            Assertions.assertThat(primeNumber.getPrimeNumbers(range).get(0))
                    .isEqualTo(2);
        } catch (IndexOutOfBoundsException exception) {
            assert true;
        }
    }

    @Test
    public void getPrimeNumberMaxValueTest() {
        Assertions.assertThat(primeNumber.getPrimeNumbers(10).get(3))
                .isEqualTo(7);
    }

    @Test
    public void getPrimeMaxNumberCountsTest() {
        Assertions.assertThat(primeNumber.getPrimeNumbers(10))
                .hasSize(4);
    }
}
