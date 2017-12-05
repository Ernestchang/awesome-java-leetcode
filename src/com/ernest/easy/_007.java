package com.ernest.easy;

public class _007 {


    public int reverse(int source) {
        int result = 0;
        for (; source != 0; source /= 10) {
            result = result * 10 + source % 10;
        }
        return result > Integer.MAX_VALUE | result < Integer.MIN_VALUE ? 0 : result;
    }

    public static void main(String[] args) {
        int source1 = 123;
        int source2 = -123;
        _007 solution = new _007();
        System.out.println(solution.reverse(source1));
        System.out.println(solution.reverse(source2));
    }


}
