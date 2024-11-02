package day10.Array_Assignment;

import java.util.HashSet;

public class Question1Approach2 {
    public static boolean findDuplicate(int nums[]) {
        HashSet<Integer> ans = new HashSet<>();  // Use HashSet<Integer>
        for (int num : nums) {
            if (ans.contains(num)) {
                return true;  // If the number is already present, it's a duplicate
            } else {
                ans.add(num);  // Otherwise, add it to the set
            }
        }
        return false;  // No duplicates found
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1};
        System.out.println(findDuplicate(nums));  // Output will be true
    }
}
