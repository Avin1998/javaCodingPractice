package com.company.arrays.stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ParanthesisBalancing {
    public static void generateParenthesis(List<String> resultArray, int target,
                                    int openCount, int closeCount ,Stack<String> transientString) {
        if(openCount == target && closeCount == target) {
            resultArray.add(transientString.toString());
            return;
        }
        if(openCount < target) {
            transientString.add("(");
            generateParenthesis(resultArray, target, openCount + 1, closeCount, transientString);
            transientString.pop();
        }
        if(closeCount < openCount) {
            transientString.add(")");
            generateParenthesis(resultArray, target, openCount, closeCount + 1, transientString);
            transientString.pop();
        }
    }
    public static void main(String[] args) {
        int target = 3;
        Stack<String> transientString = new Stack<>();
        List<String> outString = new ArrayList<>();
        generateParenthesis(outString, target, 0, 0, transientString);
        System.out.println(outString);
    }
}
