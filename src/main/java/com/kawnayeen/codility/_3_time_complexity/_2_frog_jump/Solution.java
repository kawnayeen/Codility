package com.kawnayeen.codility._3_time_complexity._2_frog_jump;

/**
 * kawnayeen
 * 5/22/17
 */
public class Solution {
    public int solution(int X, int Y, int D) {
        return (int) Math.ceil((Y - X) / (D * 1.0));
    }
}
