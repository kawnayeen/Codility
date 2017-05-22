package com.kawnayeen.codility._2_arrays._1_odd_occurance;

import com.kawnayeen.codility._2_arrays._1_odd_occurance.Solution;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kawnayeen on 5/20/17.
 */
public class SolutionTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        int[] A = new int[]{1, 3, 5, 3, 1};
        Assert.assertEquals(5, solution.solution(A));
    }

    @Test
    public void testSolutionTwo(){
        Solution solution = new Solution();
        int[] A = new int[]{1, 3, 5, 3, 1};
        Assert.assertEquals(5, solution.solution2(A));
    }
}