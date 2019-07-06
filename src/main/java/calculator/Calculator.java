package calculator;

public class Calculator {
    public int addition(int a, int b) {
        return a + b;
    }

    public int substraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public double division(Integer a, Integer b) {
        if (a == null || b == null || b == 0)
            throw new IllegalArgumentException("Cannot divide by zero.");

        return a / b;
    }

    public int calculateIntegral() {
        return 0;
    }
}
