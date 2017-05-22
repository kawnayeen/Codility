package com.kawnayeen.codility._2_arrays._2_cyclic_rotation;

/**
 * kawnayeen
 * 5/22/17
 */
public class Solution {
    public int[] solution(int[] A, int K) {
        final int ARRAY_LENGTH = A.length;
        int[] rotatedArray = new int[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            rotatedArray[(i + K) % ARRAY_LENGTH] = A[i];
        }
        return rotatedArray;
    }
}
