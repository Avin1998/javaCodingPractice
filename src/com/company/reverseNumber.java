package com.company;

public class reverseNumber {
    public static void main(String[] args) {
        int n = 1234587312;
        int out = 0;
        reverse(n,out);
    }
    static void reverse(int n,int out) {
        if((int)(n/10) == 0){
            System.out.println(out*10 + n);
            return;
        }
        int last = n % 10;
        reverse(n/10,(out * 10) + last);
        return;
    }
}
