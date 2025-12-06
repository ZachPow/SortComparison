
public class Sorter {

    public static long SelectionSort(int[] arr) {
        final long startTime = System.currentTimeMillis();

        int minIndex = 0;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        final long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public static long InsertionSort(int[] arr) {

        final long startTime = System.currentTimeMillis();
        int swapIndex = 0;
        int element = 0;

        for (int i = 0; i < arr.length; i++) {

            // find index to insert
            for (int k = i - 1; k >= 0; k--) {
                if (arr[i] > arr[k]) {
                    swapIndex = k + 1;
                    break;
                }
                if (k == 0) {
                    swapIndex = 0;
                }
            }

            // store element
            element = arr[i];

            // shift elements
            for (int k = i; k > swapIndex; k--) {
                arr[k] = arr[k - 1];
            }

            // insert element
            arr[swapIndex] = element;
        }
        final long endTime = System.currentTimeMillis();

        return (endTime - startTime);
    }
}
