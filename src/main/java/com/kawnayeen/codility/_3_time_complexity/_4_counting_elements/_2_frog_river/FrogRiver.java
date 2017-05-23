package com.kawnayeen.codility._3_time_complexity._4_counting_elements._2_frog_river;

/**
 * Created by kawnayeen on 5/23/17.
 */
public class FrogRiver {
    public int solution(int X, int[] A) {
        int[] earliestAvailable = new int[X];
        final int LENGTH = A.length;
        for (int i = 0; i < X; i++)
            earliestAvailable[i] = -1;
        for (int i = 0; i < LENGTH; i++) {
            if (earliestAvailable[A[i] - 1] == -1) {
                earliestAvailable[A[i] - 1] = i;
            } else {
                if (i < earliestAvailable[A[i] - 1])
                    earliestAvailable[A[i] - 1] = i;
            }
        }
        boolean isPossible = true;
        int maxVal = -10;
        for (int i = 0; i < X; i++) {
            if (earliestAvailable[i] == -1) {
                isPossible = false;
                break;
            }
            if (earliestAvailable[i] > maxVal) {
                maxVal = earliestAvailable[i];
            }
        }
        if (!isPossible)
            return -1;
        else
            return maxVal;
    }
}
