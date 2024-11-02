package day9;
public class LinearSearch {
    public static int search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
       return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,2,50,80,7,90,40};
        int key = 400;
        int ans = search(arr,key);
        if(ans == -1){
            System.out.println("Please enter valid key");
        } else{
            System.out.println("key is at index :" + ans);
        }
    }
}
