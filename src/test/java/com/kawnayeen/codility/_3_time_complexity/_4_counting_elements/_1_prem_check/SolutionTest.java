package com.kawnayeen.codility._3_time_complexity._4_counting_elements._1_prem_check;

import com.kawnayeen.codility._4_counting_elements._1_prem_check.Solution;
import org.junit.Assert;
import org.junit.Test;

/**
 * kawnayeen
 * 5/23/17
 */
public class SolutionTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.solution(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void testWithGap(){
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.solution(new int[]{1, 2, 4}));
    }

    @Test
    public void testWithRepeat(){
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.solution(new int[]{1, 3, 3, 4}));
    }

    @Test
    public void testSingleValue(){
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.solution(new int[]{1}));
        Assert.assertEquals(0, solution.solution(new int[]{2}));
    }

    @Test
    public void testDoubleElements(){
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.solution(new int[]{1,3}));
        Assert.assertEquals(0, solution.solution(new int[]{1,1}));
        Assert.assertEquals(1, solution.solution(new int[]{1,2}));

    }
}