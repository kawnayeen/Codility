package com.kawnayeen.codility._3_time_complexity._3_tape_equilibrium;

/**
 * Created by kawnayeen on 5/22/17.
 */
public class Solution {
    public int solution(int[] A) {
        final int LENGTH = A.length;
        if (LENGTH == 2)
            return Math.abs(A[0] - A[1]);
        int totalSum = 0;
        for (int i = 0; i < LENGTH; i++)
            totalSum += A[i];

        int previousDiff = Math.abs(totalSum);
        if (previousDiff == 0)
            previousDiff = 10000;
        int sumUpToCurrentPos = 0;

        for (int i = 0; i < LENGTH - 1; i++) {
            sumUpToCurrentPos += A[i];
            int remainingSum = totalSum - sumUpToCurrentPos;
            int nowDiff = Math.abs(sumUpToCurrentPos - remainingSum);
            if (nowDiff < previousDiff)
                previousDiff = nowDiff;
        }
        return previousDiff;
    }
}
