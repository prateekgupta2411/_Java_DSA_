package day21;

import java.util.ArrayList;

public class ContainWithMostWaterTwoPointerApproach {
    public static int maxArea(ArrayList<Integer> list){
        int maxWater = 0;
        int lp = 0;
        int rp = list.size() - 1;
        while (lp<rp){
            // cal water area
            int ht = Math.min(list.get(lp), list.get(rp));
            int width = rp-lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater,currWater);

            // update ptr
            if(list.get(lp) < list.get(rp)){
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(maxArea(list));
    }
}
