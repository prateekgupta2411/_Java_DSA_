package day21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SwapTwoNumber {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(-1);
        System.out.println(list);
        swap(list,1,3);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        // descending
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
