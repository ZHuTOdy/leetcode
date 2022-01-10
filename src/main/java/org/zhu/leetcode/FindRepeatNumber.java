package org.zhu.leetcode;

/**
 * @ClassName FindRepeatNumber
 * @Description Day 4 数组中重复的数字
 * @Author 朱镕杰
 * @Date 2022/1/10 8:12 PM
 **/
public class FindRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == i) {
                i++;
            } else {
                if (nums[nums[i]] == nums[i]) {
                    return nums[i];
                } else {
                    int tmp = nums[i];
                    nums[i] = nums[tmp];
                    nums[tmp] = tmp;
                }
            }
        }
        return -1;
    }
}
