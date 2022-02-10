package com.company.slidingWindow;
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String t = "abc";
        System.out.println(findAnagrams(s,t));
    }
    public static List<Integer> findAnagrams(String s, String p) {
        int i = 0 , j = 0;
        List<Integer> result = new ArrayList<>();
        while(j<s.length()) {
            if( p.contains(String.valueOf(s.charAt(j)) )){
                System.out.println("in");
                if( j - i + 1 == p.length()){
                    if(isAnagram(s.substring(i,j+1) , p))
                    {
                        result.add(i);
                    }
                    i++;
                }
                j++;
            }
            else {
                j++;
                i=j;
            }
        }
        return result;
    }
    public static boolean isAnagram(String s, String target) {
        char[] queryChar = s.toCharArray();
        char[] targetChar = target.toCharArray();
        if(queryChar.length != targetChar.length){
            return false;
        }
        else {
            Arrays.sort(queryChar);
            Arrays.sort(targetChar);
            for(int i =0 ; i < queryChar.length; i++) {
                if(queryChar[i] != targetChar[i]){
                    return false;
                }
            }
            return true;
        }
    }
}
