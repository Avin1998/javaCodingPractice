package com.company.arrays.stacks;

import com.company.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LargestRectangleInHistogram {

    public static List<Integer> addElement(int startIndex, int height) {
        List<Integer> arrayElement = new ArrayList<>();
        arrayElement.add(startIndex);
        arrayElement.add(height);

        return arrayElement;
    }
    public static void main(String[] args) {
        int [] startingArray = new int[]{1,1,5,6,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int maxRectangle = Integer.MIN_VALUE, lastPoppedElemIndex, lastPoppedElem;
        if(startingArray.length == 0) {

        } else if(startingArray.length == 1) {

        }
        Stack<List<Integer>> arrayStack = new Stack<>();
        arrayStack.add(addElement(0, startingArray[0]));

        for(int i = 1; i < startingArray.length; i++){
            lastPoppedElemIndex = i;
            while(!arrayStack.isEmpty() && startingArray[i] < arrayStack.peek().get(1)) {
                lastPoppedElemIndex = arrayStack.peek().get(0);
                lastPoppedElem = arrayStack.peek().get(1);
                arrayStack.pop();
                maxRectangle = Math.max(maxRectangle, lastPoppedElem * (i - lastPoppedElemIndex));
            }
            arrayStack.add(addElement(lastPoppedElemIndex, startingArray[i]));
        }
        while(!arrayStack.isEmpty()) {
            lastPoppedElemIndex = arrayStack.peek().get(0);
            lastPoppedElem = arrayStack.peek().get(1);
            maxRectangle = Math.max(maxRectangle, lastPoppedElem * (startingArray.length - lastPoppedElemIndex));
            arrayStack.pop();
        }
        System.out.println(maxRectangle);
    }
}
