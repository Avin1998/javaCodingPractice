package com.company;

import java.util.Stack;

public class candelPlace {
    public static void main(String[] args) {
        String s = "***|**|*****|**||**|*";
        int start = 0;
        int result = 0;
        String mainString = s.substring(2,13);
        Stack<Character> newStack = new Stack<>();
        while (start < mainString.length()) {
           if (mainString.charAt(start) == '|') {
               if(newStack.size() != 0) {
                   while (newStack.peek() != '|') {
                       newStack.pop();
                       result += 1;
                   }
               }
               else {
                   newStack.push('|');
               }
           }
           else {
               if (newStack.size() != 0){
                   newStack.push('*');
               }
           }
            System.out.println(newStack);
            System.out.println(mainString.charAt(start));
           start += 1;
        }
        System.out.println(result);
    }
}
