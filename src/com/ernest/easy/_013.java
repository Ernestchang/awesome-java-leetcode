package com.ernest.easy;

import java.util.HashMap;
import java.util.Map;

public class _013 {

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int len = s.length();

        // s.chatAt(len-1) 是最后一位，不是第一位，字符串默认，从左至右，指针依次递增
        int sum = map.get(s.charAt(len - 1));

        for (int i = len - 2; i >= 0; --i) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                sum -= map.get(s.charAt(i));
            } else {
                sum += map.get(s.charAt(i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        _013 solution = new _013();
        System.out.println(solution.romanToInt("IV"));
        System.out.println(solution.romanToInt("VI"));
        System.out.println(solution.romanToInt("IVVI"));
    }
}
