package day27_greadyAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Activity_Selection_Unsorted_Form {
    public static void main(String[] args) {
        // Input: unsorted start and end times
        int start[] = {0, 1, 3, 5, 5, 8};
        int end[] = {6, 2, 4, 7, 9, 9};

        // Step 1: Combine start and end times into a 2D array
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;      // Activity index
            activities[i][1] = start[i]; // Start time
            activities[i][2] = end[i];   // End time
        }

        // Step 2: Print before sorting
        System.out.println("Before Sorting:");
        for (int[] activity : activities) {
            System.out.println("Activity A" + activity[0] + ": Start = " + activity[1] + ", End = " + activity[2]);
        }

        // Step 3: Sort activities by their end times
        Arrays.sort(activities, Comparator.comparingInt(o -> o[2]));

        // Step 4: Print after sorting
        System.out.println("\nAfter Sorting:");
        for (int[] activity : activities) {
            System.out.println("Activity A" + activity[0] + ": Start = " + activity[1] + ", End = " + activity[2]);
        }

        // Step 5: Apply greedy activity selection
        int maxCount = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(activities[0][0]); // Add the index of the first activity
        int endTime = activities[0][2]; // End time of the first activity

        for (int i = 1; i < start.length; i++) {
            if (activities[i][1] >= endTime) {
                maxCount++;
                ans.add(activities[i][0]);
                endTime = activities[i][2];
            }
        }

        // Step 6: Print the results
        System.out.println("\nMax No of Activities: " + maxCount);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}
