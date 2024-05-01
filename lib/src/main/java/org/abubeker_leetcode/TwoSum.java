package org.abubeker_leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a class that provides a method for finding the indices of two numbers that add up to a target sum.
 */
public class TwoSum {

    /**
     * Finds the indices of two numbers in the given array that add up to the specified target sum.
     *
     * @param nums   An array of integers.
     * @param target The target sum to find.
     * @return An array containing the indices of the two numbers that add up to the target sum.
     * @throws IllegalArgumentException if no such pair of numbers exists.
     */
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the complement of each number along with its index
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement of the current number
            int complement = target - nums[i];
            
            // If the complement is present in the map, return the indices of the two numbers
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            
            // Otherwise, store the current number along with its index in the map
            map.put(nums[i], i);
        }

        // If no such pair of numbers exists, throw an exception
        throw new IllegalArgumentException("No two sum solution");
    }
}

