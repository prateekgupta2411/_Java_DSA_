package day21;

import java.util.ArrayList;

public class PairSum1TwoPointerApproach {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(pairSum1(list,9));
    }

    private static boolean pairSum1(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size()-1;
        while (lp<rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp++;
            }
            else {
                rp--;
            }
        }
        return false;
    }
}
