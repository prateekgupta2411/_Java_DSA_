package day9;

public class BinarySearch {
    public static int binarySearch(int arr[], int search) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == search) {
                return mid;
            } else if (arr[mid] < search) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 8, 9, 10, 15, 16};
        int search = 20;
        System.out.println(binarySearch(arr,search));
    }
}
