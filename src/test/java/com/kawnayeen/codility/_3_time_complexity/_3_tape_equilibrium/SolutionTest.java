package com.kawnayeen.codility._3_time_complexity._3_tape_equilibrium;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kawnayeen on 5/22/17.
 */
public class SolutionTest {

    @Test
    public void testSolution() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.solution(new int[]{3, 2, 2, 4, 5}));
    }

    @Test
    public void testSolutionTwoElement() {
        Solution solution = new Solution();
        Assert.assertEquals(2000, solution.solution(new int[]{-1000, 1000}));
    }

    @Test
    public void testSolutionAllNegative(){
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.solution(new int[]{-3, -2, -2, -4, -5}));
    }

    @Test
    public void testPosNegativeMix(){
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.solution(new int[]{3, 2, -2, 4, 5}));
    }

    @Test
    public void testSmall(){
        Solution solution = new Solution();
        Assert.assertEquals(20,solution.solution(new int[]{-10, -20, -30, -40, 100}));
    }
}