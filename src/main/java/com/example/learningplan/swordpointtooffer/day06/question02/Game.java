package com.example.learningplan.swordpointtooffer.day06.question02;

/**
 * LCP 01. 猜数字
 * 小A 和 小B 在玩猜数字。小B 每次从 1, 2, 3 中随机选择一个，小A 每次也从 1, 2, 3 中选择一个猜。他们一共进行三次这个游戏，请返回 小A 猜对了几次？
 * 输入的guess数组为 小A 每次的猜测，answer数组为 小B 每次的选择。guess和answer的长度都等于3。
 * 来源：力扣（LeetCode）
 * 链接：<a href="https://leetcode.cn/problems/guess-numbers">...</a>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/3/31 15:04
 * @since JDK17
 */

public class Game {
    /**
     * 我写的
     * @param guess 每轮猜的数
     * @param answer    实际答案
     * @return  猜对的次数
     */
    public int game(int[] guess, int[] answer) {
        int res = 0;
        for(int i = 0; i < 3; i++){
            if(guess[i] == answer[i]){
                res++;
            }
        }
        return res;
    }
}
