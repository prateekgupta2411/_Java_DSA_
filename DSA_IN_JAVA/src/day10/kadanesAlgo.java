package day10;

public class kadanesAlgo {
    public static int findmax(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int j : arr) {
            currSum = currSum + j;
            maxSum = Math.max(currSum, maxSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int ans = findmax(arr);
        System.out.println(ans);
    }
}
