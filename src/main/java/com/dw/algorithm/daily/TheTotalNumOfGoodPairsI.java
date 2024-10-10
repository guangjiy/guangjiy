package com.dw.algorithm.daily;

/**
 * The total number of good pairs I
 *
 * @author yanggj
 * @version 1.0.0
 * @date 2024/10/10 9:24
 * @see <a href="https://leetcode.cn/problems/find-the-number-of-good-pairs-i/description">优质数对的总数 I</a>
 */
public class TheTotalNumOfGoodPairsI {

    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int result = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] % (nums2[j] * k) == 0) {
                    result++;
                }
            }
        }
        return result;
    }

}
