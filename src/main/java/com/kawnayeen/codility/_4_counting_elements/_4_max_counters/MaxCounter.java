package com.kawnayeen.codility._4_counting_elements._4_max_counters;

/**
 * kawnayeen
 * 5/24/17
 */
public class MaxCounter {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int maxValue = 0;
        int secondMax = 0;
        final int LENGTH = A.length;

        for (int i = 0; i < LENGTH; i++) {
            if (A[i] >= 1 && A[i] <= N) {
                if (counters[A[i] - 1] < secondMax) {
                    counters[A[i] - 1] = secondMax;
                }
                counters[A[i] - 1]++;
                if (counters[A[i] - 1] > maxValue)
                    maxValue = counters[A[i] - 1];
            } else if (A[i] == (N + 1)) {
                secondMax = maxValue;
            }
        }

        for (int i = 0; i < N; i++) {
            if (counters[i] < secondMax) {
                counters[i] = secondMax;
            }
        }
        return counters;
    }
}
