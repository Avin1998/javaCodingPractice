package com.company;
//Prefix of n size bit with prefix having count #1 > count #0
public class zeroOnePrefix {
    public static void main(String args[]) {
        int n = 4;
        int zeroCount = 0 , oneCount = 1;
        String prefix = "1";
        prefixCount(prefix,n - 1,zeroCount,oneCount);
    }
    static void prefixCount(String prefix , int total, int zeroCount,int oneCount) {
        if(total == 0) {
            System.out.println(prefix);
            return;
        }
        if (oneCount > zeroCount) {
            prefixCount(prefix + "0" , total - 1, zeroCount +1, oneCount);
            prefixCount(prefix + "1" , total - 1, zeroCount, oneCount + 1);
        }
        else {
            prefixCount(prefix + "1", total - 1, zeroCount, oneCount + 1);
        }
        return;
    }
}
