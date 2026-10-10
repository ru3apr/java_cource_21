package com.learn.leetcode;

// https://leetcode.com/problems/palindrome-number/
public class PalindromeNumberSolution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int num = x;
        int reversed = 0;
        while (num !=  0) {
            int lasDigit = num % 10;
            num = num / 10;
            reversed = reversed * 10 + lasDigit;
        }
        return x == reversed;
    }
}
