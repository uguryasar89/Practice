package com.uguryasar.practice.euler;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.uguryasar.practice.euler.DistinctPower.distinctPowerCount;

public class DistictPowerTest {

    @Test
    public void test() {
        Assert.assertEquals(distinctPowerCount(), 9183);
    }
}
