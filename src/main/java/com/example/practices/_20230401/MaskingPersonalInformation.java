package com.example.practices._20230401;

import java.util.logging.Logger;

/**
 * 831. 隐藏个人信息
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/4/1 14:23
 * @since JDK17
 */

public class MaskingPersonalInformation {

    public static String maskPII(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        int len = chars.length;
        // 邮箱
        if (s.contains("@")){
            StringBuilder temp = new StringBuilder(chars[0] + "*****" + chars[s.indexOf("@") - 1]);
            for (int i = s.indexOf("@"); i < len; i++){
                temp.append(chars[i]);
            }
            System.out.println(temp);
        }else {
            int n = countNumbers(chars);
            String template;
            switch (n) {
                case 10:


            }

            System.out.println("123");
        }

        return "";
    }


    public static int countNumbers(char[] chars){
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        String str = "chentingxian@163.com";
        maskPII(str);
    }

}
