package com.uguryasar.practice.euler;

import java.util.SortedSet;
import java.util.TreeSet;

public class DistinctPower {

    public static int distinctPowerCount() {
        SortedSet<Double> allIntegers = new TreeSet<>();

        int min = 2;
        int max = 100;

        for (int a = 2; a <= 100; a++) {
            for (int b = 2; b <= 100; b++) {
                allIntegers.add(Math.pow(a, b));
            }
        }

        return allIntegers.size();
    }
}
