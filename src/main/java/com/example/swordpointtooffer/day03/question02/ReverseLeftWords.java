package com.example.swordpointtooffer.day03.question02;

/**
 * 剑指 Offer 58 - II. 左旋转字符串
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/3/27 20:55
 * @since JDK17
 */

public class ReverseLeftWords {

    public String reverseLeftWords(String s, int n) {
        String res = "";
        for(int i = n; i < n + s.length(); i++) {
            res += s.charAt(i % s.length());
        }
        return res;
    }

}
