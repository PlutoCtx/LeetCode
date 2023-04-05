package com.example.practices._202304._20230401;

/**
 * 831. 隐藏个人信息
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/4/1 14:23
 * @since JDK17
 */

public class MaskingPersonalInformation {

    /**
     * 执行结果：通过
     * 执行用时：4 ms, 在所有 Java 提交中击败了60.56%的用户
     * 内存消耗：39.7 MB, 在所有 Java 提交中击败了55.00%的用户
     * 通过测试用例：66 / 66
     * @param s 邮箱或手机号
     * @return  加密后的信息
     */
    public static String maskPII(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        int len = chars.length;
        // 邮箱
        if (s.contains("@")){
            StringBuilder temp = new StringBuilder(chars[0] + "*****" + chars[s.indexOf("@") - 1]);
            for (int i = s.indexOf("@"); i < len; i++){
                temp.append(chars[i]);
            }
            return temp.toString();
        }else {
            int n = countNumbers(chars);
            String template = null;
            switch (n) {
                case 10 -> template = "***-***-";
                case 11 -> template = "+*-***-***-";
                case 12 -> template = "+**-***-***-";
                case 13 -> template = "+***-***-***-";
                default -> {
                        template = "";
                }
            }
            template += lastFourNumbers(chars);

            return template;
        }
    }

    public static String lastFourNumbers(char[] chars){
        StringBuilder str = new StringBuilder();
        char[] c = new char[4];
        int j = 0;
        for (int i = chars.length - 1; i >= 0; i--){
            if (chars[i] >= '0' && chars[i] <= '9' && j < 4) {
                c[j++] = chars[i];
            }
        }
        for(int k = 0; k < 4; k++){
            str.append(c[3 - k]);
        }
        return str.toString();
    }

    public static int countNumbers(char[] chars){
        int count = 0;
        for (char aChar : chars) {
            if (aChar >= '0' && aChar <= '9') {
                count++;
            }
        }
        return count;
    }




    public static void main(String[] args) {
        String str = "chentingxian@163.com";
        maskPII(str);
        String str01 = "1954674949";
        maskPII(str01);
    }

}
