package com.example.practices._202304._20230413.question02;

/**
 * 2011. 执行操作后的变量值
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/4/13 10:10
 * @since JDK17
 */

public class FinalValueAfterOperations {

    /**
     * 执行操作后的变量值
     * 执行用时：1 ms, 在所有 Java 提交中击败了69.02%的用户
     * 内存消耗：41.1 MB, 在所有 Java 提交中击败了32.15%的用户
     * 通过测试用例： 259 / 259
     * @param operations    操作
     * @return  最终值
     */
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("--X") || operations[i].equals("X--")){
                res--;
            }else {
                res++;
            }
        }
        return res;
    }


    /**
     * 参考代码
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.2 MB, 在所有 Java 提交中击败了18.76%的用户
     * 通过测试用例：259 / 259
     * @param operations    操作
     * @return  最终值
     */
    public int finalValueAfterOperations02(String[] operations) {
        int sum=0;
        for (int i = 0; i < operations.length; i++) {
            char c=operations[i].charAt(1);
            if (c=='+') {
                sum++;
            } else {
                sum--;
            }
        }
        return sum;
    }

}
