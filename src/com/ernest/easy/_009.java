package com.ernest.easy;


public class _009 {


    public boolean isPalindrome_0(int source) {
        int copySource = source;
        int reverse = 0;
        while (source > 0) {
            reverse = reverse * 10 + source % 10;
            source /= 10;
        }
        return copySource == reverse;
    }

    /**
     *  WAY:首先确定一条原则可行的路，全面考虑可能得情况；具体执行时，重点关注临界点，前后判断差异。
     * @param source
     * @return
     */
    public boolean isPalindrome_1(int source) {
        if (source < 0 || (source != 0 && source % 10 == 0)) {
            return false;
        }

        int halfReverse = 0;

        /**
         * when source is odd, source will smaller than halfReverse one bit.
         * when source is even, source will equal with halfReverse.
         */
        while (source > halfReverse) {
            // add one bit form source to halfReverse
            halfReverse = halfReverse * 10 + source % 10;
            // source delete the bit who is added.Add if source is odd,the middle bit will drop now.
            source /= 10;
        }

        System.out.println("halfReverse" + halfReverse);
        System.out.println(source);
        return source == halfReverse || source == halfReverse / 10;

    }

    public static void main(String[] args) {

        _009 solution = new _009();
        System.out.println(solution.isPalindrome_0(1234321));
        System.out.println(solution.isPalindrome_1(1234321));
    }
}

