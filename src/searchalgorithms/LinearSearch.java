package searchalgorithms;

public class LinearSearch {

    public static void main(final String[] args) {
        final int[] numbers = {20, 35, -15, 7, 55, 1, -22};

        System.out.println(linearSearch(numbers, -15));
        System.out.println(linearSearch(numbers, 1));
        System.out.println(linearSearch(numbers, 99));
        System.out.println(linearSearch(numbers, -22));
    }

    private static int linearSearch(final int[] input, int valueSearch) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == valueSearch) {
                return i;
            }
        }

        return -1;
    }

}
