package com.kawnayeen.codility._5_prefix_sum;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kawnayeen on 5/24/17.
 */
public class CountDivTest {
    @Test
    public void testSolution() {
        CountDiv countDiv = new CountDiv();
        Assert.assertEquals(3, countDiv.solution(5, 10, 2));
        Assert.assertEquals(0,countDiv.solution(3,3,2));
        Assert.assertEquals(4,countDiv.solution(4,10,2));
        Assert.assertEquals(20,countDiv.solution(11,345,17));
    }
}