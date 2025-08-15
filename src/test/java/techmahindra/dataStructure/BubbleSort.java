

package techmahindra.dataStructure;

//compare the elements with one by one.
public class BubbleSort {

    /**
     * Sorts an array using the Bubble Sort algorithm.
     *
     * @param arr The array to be sorted.
     * @return The sorted array.
     */
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    // Bubble sort is simple but inefficient for large datasets due to its quadratic time complexity.
    public int[] sort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Swap arr[i] and arr[i + 1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            n--; // Reduce the range of comparison
        } while (swapped);

        return arr;
    }
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        int[] sortedArray = bubbleSort.sort(array);
        System.out.println("Sorted array: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }

}