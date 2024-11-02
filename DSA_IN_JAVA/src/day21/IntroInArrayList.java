package day21;

import java.util.ArrayList;
import java.util.List;

public class IntroInArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // Add element O(1)
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        list.add(2, 60); //O(n)
        System.out.println(list);

        // Get Element O(1)
        Integer ans = list.get(2);
        System.out.println(ans);

        // remove element O(n)
        list.remove(2);
        System.out.println(list);

        // set element O(n)
        list.set(2, 20);
        System.out.println(list);

        // contains element O(n)
        System.out.println(list.contains(10));
        System.out.println(list.contains(100));

        // size
        System.out.println(list.size());

        // print the arraylist
        for(int i=0;i< list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        // print reverse
        for(int i = list.size()-1;i>=0;i--){
            System.out.print(list.get(i) + " ");
        }
    }
}
