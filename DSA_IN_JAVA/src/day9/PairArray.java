package day9;

public class PairArray {
    public static void pair(int arr[]){
        int totalpair = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")" + " ");
                totalpair++;
            }
            System.out.println();
        }
        System.out.println(totalpair);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        pair(arr);
    }
}
