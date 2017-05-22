package com.kawnayeen.codility._2_arrays._2_cyclic_rotation;

import org.junit.Assert;
import org.junit.Test;

/**
 * kawnayeen
 * 5/22/17
 */
public class SolutionTest {
    @Test
    public void testSolution() {
        int[] A = new int[]{3, 8, 9, 7, 6};
        Solution solution = new Solution();
        int[] rotatedArray = solution.solution(A, 3);
        Assert.assertEquals(9, rotatedArray[0]);
    }
}