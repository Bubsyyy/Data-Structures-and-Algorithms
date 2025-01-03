package search;

public class BinarySearch {

    //Binary Search Algorithm is a searching algorithm used in a sorted array
    // by repeatedly dividing the search interval in half.
    // The idea of binary search is to use the information that the array is sorted
    // and reduce the time complexity to O(log n).

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 7;
        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    private static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int value = arr[mid];


            if (value == target) {
                return mid;
            }


            if (value > target) {
                right = mid - 1;
            }

            else {
                left = mid + 1;
            }
        }

        return -1;

    }
}
