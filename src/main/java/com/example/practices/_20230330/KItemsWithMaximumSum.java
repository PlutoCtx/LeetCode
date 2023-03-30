package com.example.practices._20230330;

/**
 * 2600. K 件物品的最大和
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/3/30 20:11
 * @since JDK17
 */

public class KItemsWithMaximumSum {


    /**
     * 我写的
     * @param numOnes   标记为1的数组
     * @param numZeros  标记为0的数组
     * @param numNegOnes    标记为-1的数组
     * @param k 拿包数量
     * @return  最大可能
     */
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int res = 0;
        if(k <= numOnes){
            res = k;
        }else if(k - numOnes <= numZeros){
            res = numOnes;
        }else{
            res = 2 * numOnes - k + numZeros;
        }
        return res;
    }


    /**
     * 参考代码
     * @param numOnes   标记为1的数组
     * @param numZeros  标记为0的数组
     * @param numNegOnes    标记为-1的数组
     * @param k 拿包数量
     * @return  最大可能
     */
    public int kItemsWithMaximumSum02(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k <= numOnes){
            return k;
        }else if(k - numOnes <= numZeros){
            return numOnes;
        }else{
            return 2 * numOnes - k + numZeros;
        }
    }
}
