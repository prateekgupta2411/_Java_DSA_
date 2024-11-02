package day9;

public class PrintSubarray {
    public static void printSubarray(int arr[]) {
        int tS = 0;  // Variable to count total subarrays
        int maxSum = Integer.MIN_VALUE; // Initialize max sum as smallest possible value
        int minSum = Integer.MAX_VALUE; // Initialize min sum as largest possible value

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0; // Initialize sum for each subarray
                System.out.print("(");

                // Print each subarray with commas between elements and calculate sum
                for (int k = i; k <= j; k++) {
                    sum += arr[k]; // Add each element to sum
                    System.out.print(arr[k]);
                    if (k < j) { // Add a comma if it's not the last element
                        System.out.print(", ");
                    }
                }
                System.out.print(")");
                System.out.println(" - Sum: " + sum); // Print the sum of the subarray

                // Update max and min sums
                if (sum > maxSum) {
                    maxSum = sum;
                }
                if (sum < minSum) {
                    minSum = sum;
                }

                tS++; // Count total subarrays
            }
        }
        System.out.println("Total subarrays: " + tS); // Print total subarrays
        System.out.println("Maximum subarray sum: " + maxSum); // Print maximum subarray sum
        System.out.println("Minimum subarray sum: " + minSum); // Print minimum subarray sum
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10}; // Example array
        printSubarray(arr); // Call the method to print subarrays
    }
}
