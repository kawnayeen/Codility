package com.kawnayeen.codility._3_time_complexity._1_prem_missing_element;

import org.junit.Assert;
import org.junit.Test;

/**
 * kawnayeen
 * 5/22/17
 */
public class SolutionTest {

    @Test
    public void testSolution() {
        Solution solution = new Solution();
        Assert.assertEquals(4, solution.solution(new int[]{2, 3, 1, 5}));
        Assert.assertEquals(5, solution.solution(new int[]{2, 3, 1, 4}));
        Assert.assertEquals(1, solution.solution(new int[]{2, 3, 5, 4}));
    }
}