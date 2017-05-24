package com.kawnayeen.codility._3_time_complexity._4_counting_elements._2_frog_river;

import com.kawnayeen.codility._4_counting_elements._2_frog_river.FrogRiver;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kawnayeen on 5/23/17.
 */
public class FrogRiverTest {
    @Test
    public void testSolution() {
        FrogRiver frogRiver = new FrogRiver();
        Assert.assertEquals(6, frogRiver.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
    }
}