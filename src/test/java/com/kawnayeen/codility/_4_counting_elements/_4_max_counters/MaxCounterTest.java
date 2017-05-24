package com.kawnayeen.codility._4_counting_elements._4_max_counters;

import org.junit.Assert;
import org.junit.Test;

/**
 * kawnayeen
 * 5/24/17
 */
public class MaxCounterTest {
    @Test
    public void testSolution() {
        MaxCounter maxCounter = new MaxCounter();
        int[] A = new int[]{3, 4, 4, 6, 1, 4, 4};
        int[] output = maxCounter.solution(5,A);
        Assert.assertEquals(3,output[0]);
        Assert.assertEquals(2,output[1]);
        Assert.assertEquals(2,output[2]);
        Assert.assertEquals(4,output[3]);
        Assert.assertEquals(2,output[4]);
    }
}