package day9;

public class Findlargest {
    public static int findlarget(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Smallest value is : "+ min);
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {10,2,00,80,-5,90,0};
        int ans = findlarget(arr);
        System.out.println("largest value is : " +ans);
    }

}
