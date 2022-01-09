package org.zhu.leetcode;

/**
 * @ClassName ReverseLeftWords
 * @Description Day 3 左旋字符串
 * @Author 朱镕杰
 * @Date 2022/1/9 3:28 PM
 **/
public class ReverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }
}
