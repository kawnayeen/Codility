package com.kawnayeen.codility._3_time_complexity._4_counting_elements._3_missing_int;

import com.kawnayeen.codility._4_counting_elements._3_missing_int.MissingInteger;
import org.junit.Assert;
import org.junit.Test;

/**
 * kawnayeen
 * 5/23/17
 */
public class MissingIntegerTest {
    @Test
    public void testSolution() {
        MissingInteger missingInteger = new MissingInteger();
        Assert.assertEquals(3, missingInteger.solution(new int[]{1, 2, 4}));
        Assert.assertEquals(1, missingInteger.solution(new int[]{-1, -2, -4}));
        Assert.assertEquals(1, missingInteger.solution(new int[]{4, 3, 2}));
        Assert.assertEquals(5, missingInteger.solution(new int[]{1, 3, 6, 4, 1, 2}));
        Assert.assertEquals(2, missingInteger.solution(new int[]{1}));
    }
}