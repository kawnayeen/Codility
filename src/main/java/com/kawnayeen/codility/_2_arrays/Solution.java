package com.kawnayeen.codility._2_arrays;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by kawnayeen on 5/20/17.
 */
public class Solution {
    // This one got 44% score, all the performance test failed
    public int solution(int[] A) {
        List<Integer> list = IntStream.of(A).boxed().collect(Collectors.toList());
        Set<Integer> set = new HashSet<>(list);
        for (Integer val : set) {
            if (Collections.frequency(list, val) == 1)
                return val;
        }
        return 0;
    }

    // copied from internet :)
    public int solution2(int[] A){
        int missingInt = 0;
        for (int number : A)
            missingInt = missingInt ^ number;
        return missingInt;
    }
}
