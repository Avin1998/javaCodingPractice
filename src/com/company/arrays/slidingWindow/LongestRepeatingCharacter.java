package com.company.arrays.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacter {
    public static int mostFrequentChar(HashMap<Character, Integer> frequencyHash) {
        int maxVal = 0;
        for(Map.Entry<Character, Integer> entry : frequencyHash.entrySet()) {
            maxVal = Math.max(maxVal, entry.getValue());
        }
        return maxVal;
    }
    public static void approachOne(String input, int k) {
        HashMap<Character, Integer> frequencyCount = new HashMap<>();
        int start = 0, maxLength = 0;
        for(int end = 0; end < input.length(); end++) {
            if(frequencyCount.containsKey(input.charAt(end))) {
                frequencyCount.put(input.charAt(end), frequencyCount.get(input.charAt(end)) + 1);
            } else {
                frequencyCount.put(input.charAt(end), 1);
            }
            int mostFreq = mostFrequentChar(frequencyCount);
            int slidingWindowLength = end - start + 1;
            if(slidingWindowLength - mostFreq <= k) {
                maxLength = Math.max(maxLength, slidingWindowLength);
            } else {
                frequencyCount.put(input.charAt(start), frequencyCount.get(input.charAt(start)) - 1);
                start++;
            }
        }
        System.out.println(maxLength);
    }

    public static void approachTwo(String input, int k) {

    }
    public static void main(String[] args) {
        String input = "ABAB";
        int k = 2;
        approachOne(input,k);
    }
}
