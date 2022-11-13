package sortalgorithms;

public class BubbleSort {

    public static void main(final String[] args) {
        final int[] numbers = {20, 35, -15, 7, 55, 1, -22};

        for (int unsortedPartitionIndex = numbers.length - 1; unsortedPartitionIndex > 0; unsortedPartitionIndex--) {
            for (int i = 0; i < unsortedPartitionIndex; i++) {
                final int nextIndex = i + 1;
                if (numbers[i] > numbers[nextIndex]) {
                    swap(numbers, i, nextIndex);
                }
            }
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
