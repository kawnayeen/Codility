package com.kawnayeen.codility;

import org.junit.Assert;
import org.junit.Test;

/**
 * kawnayeen
 * 5/25/17
 */
public class PassingCarTest {
    @Test
    public void testSolution() {
        PassingCar passingCar = new PassingCar();
        int[] A = new int[]{0, 1, 0, 1, 1};
        Assert.assertEquals(5,passingCar.solution(A));
    }
}