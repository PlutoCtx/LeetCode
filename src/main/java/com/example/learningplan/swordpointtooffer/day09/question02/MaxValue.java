package com.example.learningplan.swordpointtooffer.day09.question02;

/**
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/4/2 20:29
 * @since JDK17
 */

public class MaxValue {

    /**
     * 精选代码
     * 执行结果：通过
     * 显示详情
     * 查看示例代码
     * 添加备注
     * 执行用时：2 ms , 在所有 Java 提交中击败了96.22%的用户
     * 内存消耗：43.9 MB, 在所有 Java 提交中击败了65.03%的用户
     * 通过测试用例：61 / 61
     * @param grid  数组
     * @return  最大值
     */
    public int maxValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // 初始化第一行
        for(int j = 1; j < n; j++) {
            grid[0][j] += grid[0][j - 1];
        }
        // 初始化第一列
        for(int i = 1; i < m; i++) {
            grid[i][0] += grid[i - 1][0];
        }
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                grid[i][j] += Math.max(grid[i][j - 1], grid[i - 1][j]);
            }
        }
        return grid[m - 1][n - 1];
    }

    /**
     * 官方代码，不如上面的
     * @param grid  数组
     * @return  最大值
     */
    public int maxValue02(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] sum = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i > 0){
                    sum[i][j] = Math.max(sum[i][j], sum[i - 1][j]);
                }
                if(j > 0){
                    sum[i][j] = Math.max(sum[i][j], sum[i][j - 1]);
                }
                sum[i][j] += grid[i][j];
            }
        }
        return sum[m - 1][n - 1];
    }
}
