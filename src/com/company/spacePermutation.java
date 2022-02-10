package com.company;

public class spacePermutation {
    public static void main (String args[]) {
        String inp = "abc";
        String out = "";
        spacePut(inp,out);
    }
    static void spacePut (String inp,String out){
        if (inp.length() == 1){
            System.out.println(out+inp);
            return;
        }
        String out1 = out + inp.charAt(0) + "_";
        String out2 = out + inp.charAt(0);
        String inp1 = inp.substring(1);
        spacePut(inp1,out1);
        spacePut(inp1,out2);
        return;
    }
}
