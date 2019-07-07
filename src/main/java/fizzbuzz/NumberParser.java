package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class NumberParser {
    private NumberChanger numberChanger;

    public NumberParser(NumberChanger numberChanger) {
        this.numberChanger = numberChanger;
    }

    public List<String> changeInput(List<Integer> numbers) {
        List<String> list = new ArrayList<String>();

        for (Integer number : numbers)
            list.add(numberChanger.changeNumber(number));

        return list;
    }
}
