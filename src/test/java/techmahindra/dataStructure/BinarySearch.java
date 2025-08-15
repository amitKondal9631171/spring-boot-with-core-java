package techmahindra.dataStructure;

public class BinarySearch {
    /**
     * Performs binary search on a sorted array to find the index of a target value.
     *
     * @param arr    The sorted array to search in.
     * @param target The value to search for.
     * @return The index of the target value if found, otherwise -1.
     */
    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    // Binary search is efficient for large datasets because it reduces the search space by half with each iteration.
    public int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            System.out.println("Mid value: "+mid);
            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int target = 5;

        int result = binarySearch.search(sortedArray, target);
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
