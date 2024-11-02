package day9;

public class ArrAsFunArgument {
    public static void updated(int arr[], int nonChangable) {
        nonChangable = 10;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }

    public static void main(String[] args) {
        int[] marks = {85, 90, 95};
        int nonChangable = 5;
        updated(marks, nonChangable);
        System.out.println(nonChangable);
        for (int i : marks) {
            System.out.print(i + " ");
        }

    }
}
