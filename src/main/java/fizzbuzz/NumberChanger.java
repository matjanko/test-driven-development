package fizzbuzz;


public class NumberChanger {
    public String changeNumber(Integer input) {
        if (input.intValue() % 3 == 0 && input.intValue() % 5 == 0)
            return "FizzBuzz";
        else if (input.intValue() % 5 == 0)
            return "Buzz";
        else if (input.intValue() % 3 == 0)
            return "Fizz";
        else
            return input.toString();
    }
}
