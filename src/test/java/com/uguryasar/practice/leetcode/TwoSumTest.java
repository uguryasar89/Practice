package com.uguryasar.practice.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TwoSumTest {

    @Test
    public void test() {
        int[] nums = {2, 7, 11, 15};
        int[] indicies = TwoSum.twoSum(nums, 26);
        int[] expected = {2, 3};

        Assert.assertEquals(indicies, expected);
    }

}
