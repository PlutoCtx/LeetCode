package com.example.learningplan.springrecruitment.day03.question02;

/**
 * 50. Pow(x, n)
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/4/5 14:20
 * @since JDK17
 */

public class MyPow {

    /**
     * 我写的
     * 执行用时： 0 ms , 在所有 Java 提交中击败了 100.00% 的用户
     * 内存消耗： 41 MB , 在所有 Java 提交中击败了 6.10% 的用户
     * 通过测试用例： 305 / 305
     * @param x 底数
     * @param n 指数
     * @return  最终值
     */
    public double myPow(double x, int n) {
        return Math.pow(x, n);
    }


    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：40.6 MB, 在所有 Java 提交中击败了59.18%的用户
     * 通过测试用例：305 / 305
     * @param x 底数
     * @param n 指数
     * @return  最终值
     */
    public double myPow02(double x, int n) {
        if(x == 0.0f) {
            return 0.0d;
        }
        long b = n;
        double res = 1.0;
        if(b < 0) {
            x = 1 / x;
            b = -b;
        }
        while(b > 0) {
            if((b & 1) == 1) {
                res *= x;
            }
            x *= x;
            b >>= 1;
        }
        return res;
    }
}
