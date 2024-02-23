package org.mauricio;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Solutions {

    private Solutions(){}

    public static boolean isPalindrome(String s) {
        String strCleaned = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int last = strCleaned.length() - 1;
        for (int i = 0; i < strCleaned.length(); i++) {

            if (!(strCleaned.charAt(i) == strCleaned.charAt(last))) {
                return false;
            }
            last -= 1;
        }
        return true;
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (prevMap.containsKey(diff)) {

                return new int[]{prevMap.get(diff), i};
            }
            prevMap.put(nums[i], i);

        }
        return new int[]{};
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> charsSet = new LinkedHashSet<>();
        int l = 0;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char aux = s.charAt(i);
            while (charsSet.contains(aux)) {
                char rem = s.charAt(l);
                charsSet.remove(rem);
                l += 1;
            }
            charsSet.add(aux);
            res = Math.max(res, (i - l + 1));
        }
        return res;
    }
}
