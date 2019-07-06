package calculator;

public class Mathematician {
    private  Calculator calculator;

    public Mathematician(Calculator calculator) {
        this.calculator = calculator;
    }

    public int calculate() {
        int integral1 = calculator.calculateIntegral();
        int integral2 = calculator.calculateIntegral();

        return calculator.addition(integral1, integral2);
    }
}
