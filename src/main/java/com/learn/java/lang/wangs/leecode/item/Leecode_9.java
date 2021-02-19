package com.learn.java.lang.wangs.leecode.item;

/**
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 ture ；否则，返回 false 。
 *
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
 *
 *
 * 示例 1：
 * 输入：x = 121
 * 输出：true
 *
 * 示例 2：
 * 输入：x = -121
 * 输出：false
 * 解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 *
 * 示例 3：
 * 输入：x = 10
 * 输出：false
 * 解释：从右向左读, 为 01 。因此它不是一个回文数。
 *
 * 示例 4：
 * 输入：x = -101
 * 输出：false
 *  
 *
 * 提示：
 * -231 <= x <= 231 - 1
 *
 * 链接：https://leetcode-cn.com/problems/palindrome-number
 *
 * @author wangsai
 */
public class Leecode_9 {

    public boolean isPalindrome(int x) {
        if(x < 0){
            return  false;
        }
        char[] chars = String.valueOf(x).toCharArray();
        int idx = 1;
        // 1221  l=4 idx 4/2 = 2
        // 121  l=3 idx 3/2 = 1
        while (chars.length / 2 - idx >= 0){
            if(chars[idx-1] != chars[chars.length - idx]){
                return false;
            }
            idx++;
        }
        return true;
    }

    public static void main(String[] args) {
        Leecode_9 l9 = new Leecode_9();

        System.out.println(l9.isPalindrome(121));
    }
}
