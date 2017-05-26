package com.kawnayeen.codility._5_prefix_sum;

/**
 * Created by kawnayeen on 5/24/17.
 */
public class CountDiv {
    public int solution(int A, int B, int K) {
        return (B / K - A / K) + (A % K == 0 ? 1 : 0);
    }
}
