package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class specialKeyboard {
    public static void main(String[] args) {
        int n = 10;
        int out = 0;
        boolean copied = false;
        List<Integer> outList = new ArrayList<>();
        specialKeyboardCount(n,out,copied,outList,0);
        System.out.println((outList));
    }
    static void specialKeyboardCount(int n, int out, boolean copied,List<Integer> outList,int dummy) {
        if (n==0) {
            outList.add(out);
            return;
        }
        if (!copied && n >= 3) {
            specialKeyboardCount(n-1,out+1,false,outList,0);
            specialKeyboardCount(n-3,out+out,true,outList,out);
        }
        else if (copied && n >= 3) {
            specialKeyboardCount(n-1,out+dummy,true,outList,dummy);
            specialKeyboardCount(n-3,out+out,true,outList,out);
        }
        else if (copied) {
            specialKeyboardCount(n-1,out+dummy,true,outList,dummy);
        }
        else {
            specialKeyboardCount(n-1,out+1,false,outList,0);
        }
        return;
    }
}
