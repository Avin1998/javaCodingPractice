package com.company;

public class bracketBalancing {
    public static void main(String[] args) {
        int n = 10;
        int close = n , open = n-1;
        String s = "(";
        balance(s,open,close);
    }
    static void balance(String s , int open, int close){
        if (open == 0 && close == 0) {
            System.out.println(s);
            return;
        }
        if (open == close) {
            balance(s + "(" , open - 1,close);
        }
        else if (open == 0) {
            balance(s + ")" , open ,close-1);
        }
        else {
            balance(s + "(" , open - 1 , close);
            balance(s + ")" , open ,close-1);
        }
        return;
    }
}
