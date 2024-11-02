package day10;

public class PrefixSum {
    public static void prefixSum(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int  prefix[] = new int[num.length];
        prefix[0] = num[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + num[i];
        }
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max Sum = " + maxSum);
    }
    public static void main(String[] args) {
        int num[] = {1,-2,6,-1,3};
        prefixSum(num);
    }
}
