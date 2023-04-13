package com.example.practices._202304._20230413.question01;

import java.util.Arrays;

/**
 * 1828. 统计一个圆中点的数目
 *
 * @author MaxBrooks 15905898514@163.com
 * @date 2023/4/13 9:28
 * @since JDK17
 */

public class CountPoints {
    /**
     * CountPoints
     * 执行用时：23 ms, 在所有 Java 提交中击败了36.16%的用户
     * 内存消耗：41.8 MB, 在所有 Java 提交中击败了82.78%的用户
     * 通过测试用例：66 / 66
     * @param points    点坐标数组
     * @param queries   圆心半径
     * @return  圆内点（包括边缘）
     */
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];
        Arrays.fill(ans, 0);
        for (int j = 0; j < queries.length; j++) {
            for (int[] point : points) {
                double dist = (queries[j][0] - point[0]) * (queries[j][0] - point[0]) + (queries[j][1] - point[1]) * (queries[j][1] - point[1]);
                if (dist <= queries[j][2] * queries[j][2] * 1.0) {
                    ans[j]++;
                }
            }
        }
        return ans;
    }


    /**
     * 参考代码
     * 执行用时：7 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.1 MB , 在所有 Java 提交中击败了 52.32%的用户
     * 通过测试用例：66 / 66
     * @param points    点坐标数组
     * @param queries   圆心半径
     * @return  圆内点（包括边缘）
     */
    public int[] countPoints02(int[][] points, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int cx = query[0], cy = query[1], r2 = query[2] * query[2], count = points.length;
            for (int[] point : points) {
                count -= ((r2 - (point[0] - cx) * (point[0] - cx) - (point[1] - cy) * (point[1] - cy)) >>> 31);
            }
            answer[i] = count;
        }
        return answer;
    }
}
