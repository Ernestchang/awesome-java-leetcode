package com.ernest.easy;

import java.util.Arrays;
import java.util.HashMap;

public class _001 {


    public int[] twoSum_0(int[] source, int target) {
        for (int i = 0; i < source.length; i++) {
            for (int j = i + 1; j < source.length; j++) {
                if (source[i] + source[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public int[] twoSum_1(int[] source, int target) {
        int length = source.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < length; i++) {
            if (map.containsKey(source[i])) {
                return new int[]{map.get(source[i]), i};
            }
            map.put(target - source[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] source = new int[]{2, 7, 11, 15};
        int target = 9;
        _001 solution = new _001();
        System.out.println(Arrays.toString(solution.twoSum_0(source, target)));
        System.out.println(Arrays.toString(solution.twoSum_1(source, target)));
    }
}
