package com.kawnayeen.codility._3_time_complexity._4_counting_elements._3_missing_int;

import java.util.*;

/**
 * kawnayeen
 * 5/23/17
 */
public class MissingInteger {
    public int solution(int[] A) {
        final int LENGTH = A.length;
        Set<Integer> positiveNumbers = new HashSet<>();
        int maxNumber = -1;
        for (int i = 0; i < LENGTH; i++) {
            if (A[i] >= 1) {
                positiveNumbers.add(A[i]);
                if (A[i] > maxNumber) {
                    maxNumber = A[i];
                }
            }
        }
        List<Integer> integers = new ArrayList<>(positiveNumbers);
        Collections.sort(integers);
        int index = 1;
        for (; index < maxNumber; index++) {
            if (integers.get(index - 1) != index)
                break;
        }
        return index;
    }
}
