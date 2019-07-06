package calculator;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class MathematicianTest {

    Calculator calculator = Mockito.mock(Calculator.class);

    @Test
    public void calculateTest() {
        // given
        Mathematician mathematician = new Mathematician(calculator);
        Mockito.when(calculator.calculateIntegral()).thenReturn(1);
        Mockito.when(calculator.addition(1, 1)).thenReturn(3);

        // when
        int result = mathematician.calculate();

        // then
        Assert.assertEquals(3, result);
        Mockito.verify(calculator, Mockito.times(2)).calculateIntegral();
    }
}
