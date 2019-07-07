package primenumber;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public List<Integer> getPrimeNumbers(int range) {
        List<Integer> primeNumber = new ArrayList<Integer>();

        for (int i = 2; i <= range; i++) {
            int maxDivider = (int)Math.sqrt(i);
            boolean isPrime = false;
            for (int j = 2; j <= maxDivider; j++) {
                if (i % j == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (!isPrime)
                primeNumber.add(i);
        }
        return primeNumber;
    }
}
