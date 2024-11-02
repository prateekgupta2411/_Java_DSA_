package day16;

public class FindLast2ndWays {

    public static int lastOc(int arr[], int i,int key){
        // base case
        if(i == arr.length) return -1;
        // function call
        int isFound = lastOc(arr,i+1,key);
        //check condition
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {8,3,2,9,4};
        System.out.println(lastOc(arr,0,2));
    }
}
