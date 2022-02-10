package com.company;

public class subset {
    public static void main (String args[]) {
        String inp = "ab";
        String out = "";
        subsetResolve(inp,out);
    }
    static void subsetResolve(String inp , String out) {
        if (inp.length() == 0 ) {
            System.out.println(out);
            return;
        }
        String out1 = out + inp.charAt(0);
        String inp1 = inp.substring(1);

        subsetResolve(inp1, out1);
        subsetResolve(inp1 , out);
        return;
    }
}
