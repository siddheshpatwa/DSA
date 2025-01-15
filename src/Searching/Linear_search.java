package Searching;

/**
 * Linear Search Example
 * @author windows
 */
public class Linear_search {
    public static int linear(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index of the target
            }
        }
        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int target = 10;
        int result = linear(arr, target);

        if (result >= 0) { // Check if the target exists
            System.out.println("Target " + target + " found at index " + result);
        } else {
            System.out.println("Target " + target + " does not exist");
        }
    }
}
//worst case is o(n)
//best case is o(1)
//space complexity o(1)