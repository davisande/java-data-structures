package sortalgorithms;

public class SelectionSort {

    public static void main(final String[] args) {
        final int[] numbers = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = numbers.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int numberLargestIndex = 0;
            for (int i = 0; i <= lastUnsortedIndex; i++) {
                if (numbers[i] > numbers[numberLargestIndex]) {
                    numberLargestIndex = i;
                }
            }

            swap(numbers, numberLargestIndex, lastUnsortedIndex);
        }

        for (int number: numbers) {
            System.out.println(number);
        }
    }

    private static void swap(final int[] numbers, final int i, final int j) {
        if (i == j) {
            return;
        }

        final int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

}
