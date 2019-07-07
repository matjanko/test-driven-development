package fizzbuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzzMain {
    final static int turns = 3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberParser numberParser = new NumberParser(new NumberChanger());
        List<Integer> userNumbers = new ArrayList<Integer>();
        List<String> replaceNumbers;

        System.out.println("Insert three numbers:");

        for (int i = 0; i < turns; i++)
            userNumbers.add(scanner.nextInt());

        replaceNumbers = numberParser.changeInput(userNumbers);

        System.out.println(replaceNumbers);
    }
}
