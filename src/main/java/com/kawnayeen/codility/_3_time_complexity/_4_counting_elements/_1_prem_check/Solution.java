package com.kawnayeen.codility._3_time_complexity._4_counting_elements._1_prem_check;

/**
 * kawnayeen
 * 5/23/17
 */
public class Solution {
    public int solution(int[] A) {
        final int LENGTH = A.length;

        int minValue = 2147483647;
        int maxValue = -1;

        for (int i = 0; i < LENGTH; i++) {
            if (A[i] > maxValue)
                maxValue = A[i];
            if (A[i] < minValue)
                minValue = A[i];
        }

        if (minValue != 1)
            return 0;
        if (maxValue != LENGTH)
            return 0;

        if ((maxValue - minValue + 1) != LENGTH) return 0;

        boolean[] presence = new boolean[LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            presence[A[i] - minValue] = true;
        }

        boolean repeatedNumber = false;
        for (int i = 0; i < LENGTH; i++) {
            if (!presence[i]) {
                repeatedNumber = true;
                break;
            }
        }
        return repeatedNumber ? 0 : 1;
    }
}
