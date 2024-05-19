package com.company.arrays;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i<=j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i+=1;
            j-=1;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "9A man, a plan, a canal: Panama9";
        StringBuilder charS = new StringBuilder();

        for(Character c: s.toCharArray()) {
            if(Character.isAlphabetic(c) || Character.isDigit(c)) {
                charS.append(Character.toLowerCase(c));
            }
        }
        System.out.println(isPalindrome(String.valueOf(charS)));
    }
}
