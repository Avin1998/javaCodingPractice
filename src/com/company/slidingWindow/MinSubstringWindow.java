package com.company.slidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Minimum size of a window in a string to have a substring
public class MinSubstringWindow {
    public static void main(String[] args) {
        HashMap<Character, Integer> dict = new HashMap<>();
        String ques = "TOTMTAPTAT";
        String query = "TTA";
        for(int i = 0 ; i < query.length() ; i++) {
            if (dict.containsKey(query.charAt(i))) {
                dict.put(query.charAt(i), dict.get(query.charAt(i)) + 1);
            } else {
                dict.put(query.charAt(i), 1);
            }
        }
        int last = getWindowLastIndex(ques , dict );
    }

    static int getWindowLastIndex( String ques , HashMap<Character,Integer> dict) {
        int low = 0 , high = 0;
        int miniSize = Integer.MAX_VALUE;
        int count = dict.size();
        while( high < ques.length() ) {
            System.out.println( ques.charAt(low) + " " + ques.charAt(high) + " " + dict);
            if(count == 0){
                if(dict.containsKey(ques.charAt(low))) {
                    dict.put(ques.charAt(low) , dict.get(ques.charAt(low)) + 1);
                    if(dict.get(ques.charAt(low)) > 0) {
                        miniSize = miniSize < (high - low + 1) ? miniSize : (high - low + 1);
                        System.out.println("case hit " + high + " " + low);
                        count += 1;
                        high += 1;
                    }
                }
                low += 1;
            }
            else {
                if(dict.containsKey(ques.charAt(high))) {
                    dict.put( ques.charAt(high) , dict.get(ques.charAt(high)) - 1);
                    if(dict.get(ques.charAt(high)) == 0) {
                        count -= 1;
                    }
                }
                if(count == 0) continue;
                high +=1;
            }
        }
        System.out.println(miniSize);
        return miniSize;
    }
}
