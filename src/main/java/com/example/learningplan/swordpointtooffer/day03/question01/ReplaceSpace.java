package com.example.learningplan.swordpointtooffer.day03.question01;

/**
 * 剑指 Offer 05. 替换空格
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/3/27 20:48
 * @since JDK17
 */

public class ReplaceSpace {

    public String replaceSpace(String s) {
        //转换为char[] 数组，空间换时间
        final char[] chars = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <chars.length ; i++) {
            if (chars[i]==' '){//空格字符
                sb.append("%20");
            }else {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }

}


