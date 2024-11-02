package day10.Array_Assignment;

public class Question2 {
    public static int binarySerach(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) { // Target is greater, search right half
                start = mid + 1;
            } else { // Target is smaller, search left half
                end = mid - 1;
            }
        }
        return -1; // Return -1 if target is not found
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 1;
        System.out.println(binarySerach(arr,target));
    }
}
