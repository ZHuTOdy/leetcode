package org.zhu.leetcode;

/**
 * @ClassName MissingNumber
 * @Description Day 4 0~n-1中缺失的数字
 * @Author 朱镕杰
 * @Date 2022/1/10 8:41 PM
 **/
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] == m) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        return i;
    }
}
