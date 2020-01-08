package com.uguryasar.practice.euler;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.uguryasar.practice.euler.LargestPalindrom.*;

public class LargestPalindromTest {

    @Test
    public void test() {
        Assert.assertEquals(findLargestPalindrom(3), 906609);
    }

}
