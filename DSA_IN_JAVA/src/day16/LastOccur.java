package day16;

public class LastOccur {
    public static int lstOcc(int arr[], int i,int key){
        //base case
        if(i > 0){
            return -1;
        }
        if(arr[i-1] == key){
            return i;
        }
        return lstOcc(arr,i-1,key);
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(lstOcc(arr,0,5));
    }
}
