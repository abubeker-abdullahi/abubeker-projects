package org.abubeker_leetcode;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThrows;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoSumTest {

    private TwoSum twoSum;

    @Before
    public void setUp() {
        twoSum = new TwoSum();
    }

    @After
    public void tearDown() {
        // Clean up resources after each test (if any)
    }

    @Test
    public void testTwoSum_ValidSolution1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] result = twoSum.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testTwoSum_ValidSolution2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        int[] result = twoSum.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testTwoSum_NoSolution() {
        int[] nums = {2, 7, 11, 15};
        int target = 10;
        assertThrows(IllegalArgumentException.class, () -> twoSum.twoSum(nums, target));
    }
}
