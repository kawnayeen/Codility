package com.kawnayeen.codility;

/**
 * kawnayeen
 * 5/25/17
 */
public class PassingCar {
    public int solution(int[] A) {
        int numberOfZero = 0;
        int numberOfPassingCar = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0)
                numberOfZero++;
            else
                numberOfPassingCar += numberOfZero;
        }
        if (numberOfPassingCar > 1000000000)
            return -1;
        return numberOfPassingCar;
    }
}
