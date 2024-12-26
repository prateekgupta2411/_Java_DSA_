package day27_greadyAlgo;

import java.util.Arrays;
import java.util.Comparator;

public class Fractional_Knapsack {
    public static void main(String[] args) {
        // Values (profit) and weights of the items
        int value[] = {60, 100, 120}; // Profit for each item
        int weight[] = {10, 20, 30}; // Weight of each item
        int W = 50; // Capacity of the knapsack

        // Array to store value-to-weight ratios along with the item index
        double[][] ratio = new double[value.length][2];
        // 0th column => index of the item
        // 1st column => value-to-weight ratio

        // Step 1: Calculate the value-to-weight ratio for each item
        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i; // Store the index of the item
            ratio[i][1] = value[i] / (double) weight[i]; // Calculate value/weight ratio
        }

        // Step 2: Sort the ratio array in ascending order based on the value-to-weight ratio
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        // Step 3: Initialize variables to track the remaining capacity and total value
        int capacity = W; // Remaining capacity of the knapsack
        int finalValue = 0; // Total value of items added to the knapsack

        // Step 4: Iterate through the items in descending order of value-to-weight ratio
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0]; // Get the index of the current item

            // Check if the item can fit fully into the remaining capacity
            if (capacity >= weight[idx]) {
                // Include the full item
                finalValue += value[idx]; // Add the full value of the item
                capacity -= weight[idx]; // Reduce the remaining capacity
            } else {
                // Include the fractional part of the item
                finalValue += (ratio[i][1] * capacity); // Add fractional value based on remaining capacity
                capacity = 0; // Knapsack is full
                break; // No more items can be added
            }
        }

        // Step 5: Print the maximum total value in the knapsack
        System.out.println("The max total value in Knapsack : " + finalValue);
    }
}
