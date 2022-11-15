package sortalgorithms;

public class InsertionSort {

    public static void main(final String[] args) {
        final int[] numbers = {20, 35, -15, 7, 55, 1, -22};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < numbers.length; firstUnsortedIndex++) {
            final int currentNumber = numbers[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i > 0 && numbers[i - 1] > currentNumber; i--) {
                numbers[i] = numbers[i - 1];
            }

            numbers[i] = currentNumber;
        }

        for (int number: numbers) {
            System.out.println(number);
        }
    }

}
