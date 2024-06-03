package com.company.arrays.stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DailyTemperature {
    public static List<Integer> createListElement(int index, int element) {
        List<Integer> arrayElement = new ArrayList<>();
        arrayElement.add(index);
        arrayElement.add(element);
        return arrayElement;
    }

    public static void printResult(int[] resultArray) {
        for(int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
    public static void firstSolution(int[] dailyTemp) {
        {
            Stack<List<Integer>> transientStack = new Stack<>();
            transientStack.add(createListElement(0, dailyTemp[0]));
            int [] resultArray = new int[dailyTemp.length];

            int i = 1;
            while(i < dailyTemp.length) {
                List<Integer> poppedListItem;
                while(!transientStack.isEmpty() && dailyTemp[i] > transientStack.peek().get(1)) {
                    poppedListItem = transientStack.pop();
                    resultArray[poppedListItem.get(0)] = i - poppedListItem.get(0);
                }
                transientStack.add(createListElement(i, dailyTemp[i]));
                i += 1;
            }
            printResult(resultArray);
        }
    }

    public static void secondSolution(int[] dailyTemp) {
        Stack<Integer> midStack = new Stack<>();
        int[] resultArray = new int[dailyTemp.length];

        midStack.add(0);
        int midIndex;
        for(int i = 1 ; i < dailyTemp.length; i++) {
            while(!midStack.isEmpty() && dailyTemp[i] > dailyTemp[midStack.peek()]) {
                midIndex = midStack.pop();
                resultArray[midIndex] = i - midIndex;
            }
            midStack.add(i);
        }
        printResult(resultArray);
    }
    public static void main(String[] args) {
        int[] dailyTemp = new int[]{73,74,75,71,69,72,76,73};
        secondSolution(dailyTemp);
    }
}
