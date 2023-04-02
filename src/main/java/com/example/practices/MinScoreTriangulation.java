package com.example.practices;

import java.util.Arrays;

/**
 * 1039. 多边形三角剖分的最低得分
 * 你有一个凸的n边形，其每个顶点都有一个整数值。给定一个整数数组values，其中values[i]是第 i 个顶点的值（即 顺时针顺序 ）。
 * 假设将多边形 剖分为 n - 2个三角形。对于每个三角形，该三角形的值是顶点标记的乘积，三角剖分的分数是进行三角剖分后所有 n - 2个三角形的值之和。
 * 返回 多边形进行三角剖分后可以得到的最低分 。
 * 来源：力扣（LeetCode）
 * 链接：<a href="https://leetcode.cn/problems/minimum-score-triangulation-of-polygon">...</a>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/4/2 19:29
 * @since JDK17
 */

public class MinScoreTriangulation {
//    public int minScoreTriangulation(int[] values) {
//        if (values.length == 3){
//            return values[0] * values[1] * values[2];
//        }else {
//            for (int i = 0; i < values.length; i++){
//                int[] temp = new int[values.length - 1];
//                for (int j = 0; j < values.length - 1; j++) {
//                    if (i != j){
//                        temp[j] = values[i];
//                    }
//                }
//                minScoreTriangulation(temp);
//            }
//        }
//        return 0;
//
//

    /**
     * 参考代码01
     */
    /*
    private int[] items;
    private int length;

    public int minScoreTriangulation(int[] arr) {
        this.length = arr.length;
        this.items = new int[length * length];
        return find(arr, 0, arr.length - 1);
    }

    private int find(int[] arr, int st, int end) {
        int size = end - st + 1;
        if (size < 3) {
            return 0;
        }
        int key = st * length + end;
        if (items[key] != 0) {
            return items[key];
        }
        if (size == 3) {
            items[key] = arr[st] * arr[st + 1] * arr[st + 2];
            return items[key];
        }
        int min = Integer.MAX_VALUE;
        for (int i = st + 1; i < end; i++) {
            int v = arr[st] * arr[end] * arr[i];
            if (v >= min) {
                continue;
            }
            v += find(arr, st, i);
            if (v >= min) {
                continue;
            }
            min = Math.min(min, v + find(arr, i, end));
        }
        items[key] = min;
        return min;
    }*/



    /**
     * 执行结果：通过
     *     显示详情
     *     查看示例代码
     *     添加备注
     *     执行用时：2 ms, 在所有 Java 提交中击败了100.00%的用户
     *     内存消耗：39.1 MB, 在所有 Java 提交中击败了60.38%的用户
     *     通过测试用例：94 / 94
     */
    private int[] v;
    private int[][] memo;

    public int minScoreTriangulation02(int[] values) {
        v = values;
        int n = v.length;
        memo = new int[n][n];
        for (int i = 0; i < n; ++i) {
            Arrays.fill(memo[i], -1); // -1 表示没有访问过
        }
        return dfs(0, n - 1);
    }

    private int dfs(int i, int j) {
        if (i + 1 == j) {
            return 0; // 只有两个点，无法组成三角形
        }
        if (memo[i][j] != -1) {
            return memo[i][j];
        }
        int res = Integer.MAX_VALUE;
        // 枚举顶点 k
        for (int k = i + 1; k < j; ++k) {
            res = Math.min(res, dfs(i, k) + dfs(k, j) + v[i] * v[j] * v[k]);
        }
        return memo[i][j] = res;
    }



    /**
     * 执行结果：通过
     * 显示详情
     * 查看示例代码
     * 添加备注
     * 执行用时：3 ms, 在所有 Java 提交中击败了88.68%的用户
     * 内存消耗：38.8 MB, 在所有 Java 提交中击败了92.45%的用户
     * 通过测试用例：94 / 94
     */
    public int minScoreTriangulation03(int[] v) {
        int n = v.length;
        int[][] f = new int[n][n];
        for (int i = n - 3; i >= 0; --i) {
            for (int j = i + 2; j < n; ++j) {
                f[i][j] = Integer.MAX_VALUE;
                for (int k = i + 1; k < j; ++k) {
                    f[i][j] = Math.min(f[i][j], f[i][k] + f[k][j] + v[i] * v[j] * v[k]);
                }
            }
        }
        return f[0][n - 1];
    }

}

