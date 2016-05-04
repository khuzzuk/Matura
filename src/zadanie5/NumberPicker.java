package zadanie5;

import java.util.Arrays;

public class NumberPicker {
    static int getMostPopular(final int[] numbers){
        int[] sorted = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(sorted);
        int number = sorted[0];
        int countMax=1, countCurrent=1, currentNumber, previousNumber=number;
        for (int i = 1; i < sorted.length; i++) {
            currentNumber = sorted[i];
            if (currentNumber!=previousNumber){
                previousNumber = currentNumber;
                countCurrent=1;
            }
            else if (currentNumber==number) {
                countMax++;
            }
            else {
                countCurrent++;
            }
            if (countCurrent>countMax){
                number = currentNumber;
                countMax = countCurrent;
            }
        }
        return number;
    }
}
