package com.example.practices._202304._20230403;

import java.util.logging.Logger;

/**
 * 9. 回文数
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/4/3 10:46
 * @since JDK17
 */

public class Palindrome {


    /**
     * 我写的
     * 执行结果：通过
     * 执行用时： 8 ms, 在所有 Java 提交中击败了17.88%的用户
     * 内存消耗：41.1 MB, 在所有 Java 提交中击败了21.83%的用户
     * 通过测试用例：11510 / 11510
     * @param x 数字
     * @return  是否为回文数
     */
    public static boolean isPalindrome(int x) {
        /*
            执行用时：7 ms, 在所有 Java 提交中击败了30.96%的用户
            内存消耗：41.3 MB, 在所有 Java 提交中击败了12.22%的用户
         */
        if (x < 0){
            return false;
        }
        int length = String.valueOf(x).length();
        char[] chars;
        boolean flag = true;
        chars = (x+"").toCharArray();
        for (int i = 0; i < length; i++) {
            if (chars[i] != chars[length - 1 - i]) {
                flag = false;
                break;
            }
        }
        return flag;
    }


    /**
     * 精选题解
     * 执行用时：6 ms, 在所有 Java 提交中击败了55.90%的用户
     * 内存消耗：40.6 MB, 在所有 Java 提交中击败了81.89%的用户
     * 通过测试用例：11510 / 11510
     * @param x 数字
     * @return  是否为回文数
     */
    public boolean isPalindrome02(int x) {
        //思考：这里大家可以思考一下，为什么末尾为 0 就可以直接返回 false
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }

    /**
     * 执行用时：5 ms, 在所有 Java 提交中击败了97.94%的用户
     * 内存消耗：40.6 MB, 在所有 Java 提交中击败了84.51%的用户
     * 通过测试用例：11510 / 11510
     * @param x 数字
     * @return  是否为回文数
     */
    public boolean isPalindrome03(int x) {
        if (x < 0) {
            return false;
        }
        int help = 1;
        int tmp = x;
        while (tmp >= 10) {
            help *= 10;
            tmp /= 10;
        }
        while (x != 0) {
            if (x % 10 != x / help) {
                return false;
            }
            x = x % help / 10;
            help /= 100;
        }
        return true;
    }


    public static void main(String[] args) {
        Logger.getGlobal().info(isPalindrome(123321) + "");
    }
}
