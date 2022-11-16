package searchalgorithms;

public class BinarySearch {

    public static void main(final String[] args) {
        final int[] numbers = {-22, -15, 1, 7, 20, 35, 55};

        System.out.println(interactiveBinarySearch(numbers, -15));
        System.out.println(interactiveBinarySearch(numbers, 1));
        System.out.println(interactiveBinarySearch(numbers, 99));
        System.out.println(interactiveBinarySearch(numbers, -22));
        System.out.println(interactiveBinarySearch(numbers, 55));

        System.out.println(recursiveBinarySearch(numbers, -15));
        System.out.println(recursiveBinarySearch(numbers, 1));
        System.out.println(recursiveBinarySearch(numbers, 99));
        System.out.println(recursiveBinarySearch(numbers, -22));
        System.out.println(recursiveBinarySearch(numbers, 55));
    }

    public static int interactiveBinarySearch(final int[] input, final int valueSearch) {
        int startIndex = 0;
        int endIndex = input.length;

        while (startIndex < endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;

            if (input[middleIndex] == valueSearch) {
                return middleIndex;
            } else if (input[middleIndex] < valueSearch) {
                startIndex = middleIndex + 1;
            } else {
                endIndex = middleIndex;
            }
        }

        return -1;
    }

    public static int recursiveBinarySearch(final int[] input, final int valueSearch) {
        return performBinarySearch(input, 0, input.length, valueSearch);
    }

    private static int performBinarySearch(final int[] input, final int startIndex, final int endIndex,
                                           final int valueSearch) {
        if (startIndex >= endIndex) {
            return -1;
        }

        final int middleIndex = (startIndex + endIndex) / 2;
        if (input[middleIndex] == valueSearch) {
            return middleIndex;
        } else if (input[middleIndex] < valueSearch) {
            return performBinarySearch(input, middleIndex + 1, endIndex, valueSearch);
        } else {
            return performBinarySearch(input, startIndex, middleIndex, valueSearch);
        }
    }
}
