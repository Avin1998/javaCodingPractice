package com.company;

import javax.sound.midi.Soundbank;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        delMid(s,s.size());
        System.out.println(s);
    }

    static void delMid (Stack<Integer> s,int k) {
        if (k==0){
            return;
        }
        int last = s.pop();
        delMid(s,k-1);
        reverse(s,last);
        return;
    }

    static void reverse (Stack<Integer> s , int k) {
        if (s.size() == 0) {
            s.push(k);
            return;
        }
        int last = s.pop();
        reverse(s,k);
        s.push(last);
        return;
    }
}
