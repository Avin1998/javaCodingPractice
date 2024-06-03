package com.company.arrays.slidingWindow;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {

    public static void approachOne(String input) {
        HashSet<Character> comparisonSet = new HashSet<>();
        if(input.length() == 1) {
            System.out.println(1);
            return;
        }
        int  i = 0, j = 1, result = Integer.MIN_VALUE, counter = 1;
        comparisonSet.add(input.charAt(i));
        while(j < input.length()) {
            if(comparisonSet.contains(input.charAt(j))) {
                result = Math.max(result, counter);
                counter--;
                comparisonSet.remove(input.charAt(i));
                i++;
            } else {
                comparisonSet.add(input.charAt(j));
                j++;
                counter++;
            }
        }
        result = Math.max(result, counter);
        System.out.println(result);
    }
    public static int approachTwo(String input) {
        int[] charArray = new int[128];
        int start = 0, maxLength = 0;
        for(int end = 0; end < input.length(); end++) {
            char ch = input.charAt(end);
            if(charArray[ch] > start) {
                start = charArray[ch];
            }
            charArray[ch] = end + 1;
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String input = "au";
        System.out.println(approachTwo(input));
    }
}
