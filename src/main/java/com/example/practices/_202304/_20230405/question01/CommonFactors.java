package com.example.practices._202304._20230405.question01;

/**
 * 2427. 公因子的数目
 * 给你两个正整数 a 和 b ，返回 a 和 b 的 公 因子的数目。
 * 如果 x 可以同时整除 a 和 b ，则认为 x 是 a 和 b 的一个 公因子 。
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/4/5 13:37
 * @since JDK17
 */

public class CommonFactors {

    /**
     * 我写的
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.2 MB, 在所有 Java 提交中击败了59.58%的用户
     * 通过测试用例：76 / 76
     * @param a 数字
     * @param b 数字
     * @return  公因子数目
     */
    public int commonFactors(int a, int b) {
        int count = 0;
        if (a >= b){
            if (a % b == 0){
                for (int i = 1; i <= b; i++){
                    if (b % i == 0){
                        count++;
                    }
                }
            }else {
                for (int i = 1; i <= b; i++){
                    if (b % i == 0 && a % i == 0){
                        count++;
                    }
                }

            }
        }else {
            if (b % a == 0){
                for (int i = 1; i <= b; i++){
                    if (a % i == 0){
                        count++;
                    }
                }
            }else {
                for (int i = 1; i <= a; i++){
                    if (b % i == 0 && a % i == 0){
                        count++;
                    }
                }

            }
        }
        return count;
    }

    /**
     * 我写的
     * 执行用时：1 ms, 在所有 Java 提交中击败了32.48%的用户
     * 内存消耗：38.1 MB, 在所有 Java 提交中击败了75.24%的用户
     * 通过测试用例：76 / 76
     * @param a 数字
     * @param b 数字
     * @return  公因子数目
     */
    public int commonFactors02(int a, int b) {
        int count = 0;
        if (a < b){
            int temp = a;
            a = b;
            b = temp;
        }

        if (a % b == 0){
            for (int i = 1; i <= b; i++){
                if (b % i == 0){
                    count++;
                }
            }
        }else {
            for (int i = 1; i <= b; i++){
                if (b % i == 0 && a % i == 0){
                    count++;
                }
            }
        }
        return count;
    }


    /**
     * 参考代码
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38 MB, 在所有 Java 提交中击败了92.99%的用户
     * 通过测试用例：76 / 76
     * @param a 数字
     * @param b 数字
     * @return  公因子数目
     */
    public int commonFactors03(int a, int b) {
        int c = gcd(a, b), ans = 0;
        for (int x = 1; x * x <= c; ++x) {
            if (c % x == 0) {
                ++ans;
                if (x * x != c) {
                    ++ans;
                }
            }
        }
        return ans;
    }
    public int gcd(int a, int b) {
        while (b != 0) {
            a %= b;
            a ^= b;
            b ^= a;
            a ^= b;
        }
        return a;
    }


}
