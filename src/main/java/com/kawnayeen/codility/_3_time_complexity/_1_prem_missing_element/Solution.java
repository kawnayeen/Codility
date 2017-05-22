package com.kawnayeen.codility._3_time_complexity._1_prem_missing_element;

/**
 * kawnayeen
 * 5/22/17
 */
public class Solution {
    public int solution(int[] A) {
        final int LENGTH = A.length;
        boolean[] presence = new boolean[LENGTH + 1];
        for (int i = 0; i < LENGTH; i++) {
            presence[A[i] - 1] = true;
        }
        int index = 0;
        for (; index < LENGTH; index++) {
            if (!presence[index]) {
                break;
            }
        }
        return (index + 1);
    }
}
