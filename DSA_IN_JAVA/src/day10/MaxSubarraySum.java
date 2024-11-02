package day10;

public class MaxSubarraySum {
    public static void maxSubArrSum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int CurrSum = 0;
        for(int i=0;i<arr.length;i++) {
            for (int j = i; j < arr.length; j++) {
                CurrSum = 0;
                for (int k = i; k <= j; k++) {
                    CurrSum += arr[k];
                }
                System.out.println(CurrSum);
                if(maxSum < CurrSum){
                    maxSum = CurrSum;
                }
            }
        }
        System.out.println("Max Sum is :" + maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        maxSubArrSum(arr);
    }
}
