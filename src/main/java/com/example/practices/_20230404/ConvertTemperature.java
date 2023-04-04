package com.example.practices._20230404;

/**
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/4/4 21:54
 * @since JDK17
 */

public class ConvertTemperature {

    /**
     * 我写的
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.5 MB, 在所有 Java 提交中击败了94.05%的用户
     * 通过测试用例：74 / 74
     * @param celsius   摄氏温度
     * @return  开尔文温度 华氏度
     */
    public double[] convertTemperature(double celsius) {
        double[] temp = new double[2];
        temp[0] = celsius + 273.15;
        temp[1] = celsius * 1.80 + 32.00;
        return temp;
    }

}
