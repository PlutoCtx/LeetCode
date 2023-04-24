package com.example.learningplan.LeetCode75.day01;

/**
 * LeetCode
 * 1768. 交替合并字符串
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/4/24 20:24
 * @since JDK17
 */

public class MergeAlternately {

    /**
     * 我写的
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗： 39.8 MB, 在所有 Java 提交中击败了44.63%的用户
     * 通过测试用例：108 / 108
     * @param word1 字符串1
     * @param word2 字符串2
     * @return 合并后的字符串
     */
    public String mergeAlternately(String word1, String word2) {
        char[] word01 = word1.toCharArray();
        char[] word02 = word2.toCharArray();
        int l1 = word01.length;
        int l2 = word02.length;
        int i = 0;
        int j = 0;
        char[] merged = new char[l1 + l2];
        int count = 0;
        while (i < l1 || j < l2){
            if (i < l1) {
                merged[count] = word01[i];
                count++;
                i++;
            }
            if (j < l2) {
                merged[count] = word02[j];
                count++;
                j++;
            }
        }
        String res = String.valueOf(merged);
        return res;
    }


    /**
     * 经典代码
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.7 MB, 在所有 Java 提交中击败了75.91%的用户
     * 通过测试用例：108 / 108
     * @param s1 字符串1
     * @param s2 字符串2
     * @return 合并后的字符串
     */
    public String mergeAlternately02(String s1, String s2) {
        int n = s1.length(), m = s2.length(), i = 0, j = 0;
        StringBuilder sb = new StringBuilder();
        while (i < n || j < m) {
            if (i < n) {
                sb.append(s1.charAt(i++));
            }
            if (j < m) {
                sb.append(s2.charAt(j++));
            }
        }
        return sb.toString();
    }


}
