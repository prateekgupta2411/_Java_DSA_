package day21;

import java.util.ArrayList;

public class MaxElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(-1);
        System.out.println(list);

        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
//            if(list.get(i) >max ){
//                max = list.get(i);
//            }
            max = Math.max(max, list.get(i));
        }
        System.out.println("max element of list :" +max);
    }
}
