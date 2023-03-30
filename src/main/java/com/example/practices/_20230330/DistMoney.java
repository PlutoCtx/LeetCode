package com.example.practices._20230330;

/**
 * 2591. 将钱分给最多的儿童
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/3/30 20:14
 * @since JDK17
 */

public class DistMoney {


    /**
     * 给孩子分钱
     * @param money 钱
     * @param children  孩子数
     * @return  最多有几人能分到8块钱
     */
    public int distMoney(int money, int children) {
        // 每人至少 1 美元
        money -= children;
        if (money < 0) {
            return -1;
        }
        // 初步分配，让尽量多的人分到 8 美元
        int ans = Math.min(money / 7, children);
        money -= ans * 7;
        children -= ans;
        // 必须找一个前面分了 8 美元的人，分完剩余的钱 // 不能有人恰好分到 4 美元
        if (children == 0 && money > 0 || children == 1 && money == 3) {
            --ans;
        }
        return ans;
    }

}
