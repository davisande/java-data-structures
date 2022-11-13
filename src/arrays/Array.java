package arrays;

public class Array {

    public static void main(final String[] args) {
        final int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        /*
        Find by number - O(n) - linear time.
        If the search is by index it is possible use an expression (initial address memory + (index * data size))
        to calculate the index space memory and found the value quickly. In this case the BigO is O(1).
         */
        final int searchNumber = 7;
        int index = -1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == searchNumber) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}
