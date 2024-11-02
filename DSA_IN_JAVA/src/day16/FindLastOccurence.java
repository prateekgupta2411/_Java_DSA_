package day16;

public class FindLastOccurence {
    public static int lastOcc(int arr[] ,int i, int key){
        if(i < 0){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
       return lastOcc(arr,i-1,key);
    }
    public static void main(String[] args) {
        int arr[] = {8,3,2,9,2,4};
        System.out.println(lastOcc(arr,arr.length-1,2));
    }
}
