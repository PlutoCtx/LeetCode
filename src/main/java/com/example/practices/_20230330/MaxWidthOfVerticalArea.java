package com.example.practices._20230330;

/**
 * 1637. 两点之间不包含任何点的最宽垂直区域
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/3/30 20:17
 * @since JDK17
 */

public class MaxWidthOfVerticalArea {

    /**
     * 参考代码
     * @param points    点坐标
     * @return  最大宽度
     */
    public int maxWidthOfVerticalArea(int[][] points) {
        int mini = points[0][0];
        int maxi = points[0][0];
        for (int[] p : points) {
            mini = Math.min(mini, p[0]);
            maxi = Math.max(maxi, p[0]);
        }
        if (mini == maxi) {
            return 0;
        }
        int[][] c = new int[points.length + 1][];
        final int d = maxi - mini;
        for (int[] p : points) {
            int ind =(int) ((p[0] - mini) * ((long) points.length) / d);
            if (c[ind] == null) {
                c[ind] = new int[]{p[0], p[0]};
            }else{
                c[ind][0] = Math.min(c[ind][0], p[0]);
                c[ind][1] = Math.max(c[ind][1], p[0]);
            }
        }
        int r=0;
        for (int last = c[0][1], i = 0; i < points.length; i++) {
            if (c[i] != null) {
                r = Math.max(r, c[i][0] - last);
                last = c[i][1];
            }
        }
        return r;
    }

}
