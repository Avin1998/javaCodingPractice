package com.company;

import javax.sound.midi.Soundbank;

public class caseChangePermutation {
    public static void main(String[] args) {
        String inp = "a1B2";
        String out = "";
        caseChange(inp,out);
    }
    static void caseChange(String inp, String out) {
        if(inp.length() == 0) {
            System.out.println(out);
            return;
        }
        String firstchar = "" + inp.charAt(0);
        String pattern = "\\d+";
        String out1 = out + firstchar.toUpperCase();
        String out2 = out + firstchar.toLowerCase();
        String out3 = out + firstchar;
        String inp1 = inp.substring(1);
        if(firstchar.matches(pattern)) {
            caseChange(inp1,out3);

        }
        else {
            caseChange(inp1,out1);
            caseChange(inp1,out2);
        }
        return;
    }
}
