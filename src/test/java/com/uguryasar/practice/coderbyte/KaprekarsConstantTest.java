package com.uguryasar.practice.coderbyte;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.uguryasar.practice.coderbyte.KaprekarsConstant.kaprekarsConstantRepeatCount;

public class KaprekarsConstantTest {

    @Test
    public void test1() {
        Assert.assertEquals(kaprekarsConstantRepeatCount(3524), 3);
    }

    @Test
    public void test2() {
        Assert.assertEquals(kaprekarsConstantRepeatCount(2111), 5);
    }

    @Test
    public void test3() {
        Assert.assertEquals(kaprekarsConstantRepeatCount(9831), 7);
    }

}
