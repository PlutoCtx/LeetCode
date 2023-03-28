package com.example.swordpointtooffer.day040;

/**
 * 剑指 Offer 53 - I. 在排序数组中查找数字 I
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/3/28 22:15
 * @since JDK17
 */

public class NumberInSortedArray {

//    public int search(int[] nums, int target) {
//        int count = 0;
//        for(int i = 0; i <nums.length; i++){
//            if(nums[i] == target){
//                count++;
//            }
//        }
//        return count;
//    }


//    public int search(int[] nums, int target) {
//        if (nums.length == 0) return 0;
//        int first = findFirst(nums, target);
//        if (first == -1) {
//            return 0;
//        }
//        int last = findLast(nums, target);
//        return last - first + 1;
//    }
//
//    private int findFirst(int[] nums, int target) {
//        int left = 0;
//        int right = nums.length - 1;
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] < target) {
//                // [mid +1 ... right]
//                left = mid + 1;
//            } else if (nums[mid] == target) {
//                // [left ... mid]
//                right = mid;
//            } else {
//                // [left ... mid-1]
//                right = mid - 1;
//            }
//        }
//        // 退出循环后，left和right重合了
//        if (nums[left] == target) {
//            return left;
//        }
//        return -1;
//    }
//
//    private int findLast(int[] nums, int target) {
//        int left = 0;
//        int right = nums.length - 1;
//        while (left < right) {
//            int mid = left + (right - left + 1) / 2;
//            if (nums[mid] < target) {
//                // [mid +1 ... right]
//                left = mid + 1;
//            } else if (nums[mid] == target) {
//                // [mid ... right]
//                left = mid;
//            } else {
//                // [left ... mid-1]
//                right = mid - 1;
//            }
//        }
//        // 退出循环后，left和right重合了
//        return left;
//    }



    public int search(int[] nums, int target) {
        int leftIdx = binarySearch(nums, target, true);
        int rightIdx = binarySearch(nums, target, false) - 1;
        if (leftIdx <= rightIdx && rightIdx < nums.length && nums[leftIdx] == target && nums[rightIdx] == target) {
            return rightIdx - leftIdx + 1;
        }
        return 0;
    }

    public int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0;
        int right = nums.length - 1;
        int ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }






}
