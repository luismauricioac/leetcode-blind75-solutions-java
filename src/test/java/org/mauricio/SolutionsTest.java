package org.mauricio;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class SolutionsTest {

    @Test
    void isPalindrome() {
        assertTrue(Solutions.isPalindrome("amanaplanacanalpanama"));
    }

    @Test
    void twoSum() {
        int[] expeted = new int[]{0,1};
        int[] testResult = Solutions.twoSum(new int[]{2,7,11,15},9);
        assertArrayEquals(expeted, testResult);
    }

    @Test
    void lengthOfLongestSubstring() {
        int expeted = 3;
        assertEquals(expeted, Solutions.lengthOfLongestSubstring("pwwkew"));
    }
}