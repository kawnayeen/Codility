package com.kawnayeen.codility._1_binary_gap;

/**
 * Created by kawnayeen on 5/19/17.
 */
public class Solution {
    public int solution(int N) {
        String binaryStr = Integer.toBinaryString(N);
        String[] strs = binaryStr.split("");
        int maxCount = 0;
        int tempMax = 0;
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].equals("0"))
                tempMax++;
            else {
                if (tempMax > maxCount)
                    maxCount = tempMax;
                tempMax = 0;
            }
        }
        return maxCount;
    }
}
