package com.kawnayeen.codility._5_prefix_sum;

/**
 * Created by kawnayeen on 5/24/17.
 */
public class CountDiv {
    public int solution(int A, int B, int K) {
        int divisibleAtLowerEnd = A % K == 0 ? 1 : 0;
        if (A == B) {
            return divisibleAtLowerEnd;
        }
        int divisibleAtMiddle = (B - A) / K;
        int divisibleAtUpperEnd = B % K == 0 ? 1 : 0;
        if (divisibleAtLowerEnd == divisibleAtUpperEnd && divisibleAtLowerEnd == 1)
            divisibleAtUpperEnd = 0;
        return (divisibleAtLowerEnd + divisibleAtMiddle + divisibleAtUpperEnd);
    }
}
