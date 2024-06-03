package com.company.arrays.stacks;

import java.util.ArrayList;

public class MinStack {
    ArrayList<Integer> stack;
    ArrayList<Integer> minStack;
    public MinStack() {
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
    }

    public void push(int val) {
        if(minStack.isEmpty()) {
            minStack.add(val);
        } else {
            int currentNodeMin = Math.min(minStack.get(stack.size() - 1), val);
            minStack.add(currentNodeMin);
        }
        stack.add(val);
    }

    public void pop() {

    }


    public int top() {
        return stack.get(stack.size() - 1);
    }

    public int getMin() {
        System.out.println(minStack.get(minStack.size() - 1));
        return minStack.get(minStack.size() - 1);
    }

    public String toString() {
        StringBuilder stackToString = new StringBuilder();
        for(int elem : stack) {
            stackToString.append(" " + elem);
        }
        return String.valueOf(stackToString);
    }
}

class MinStackRun {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin();
        minStack.pop();
        minStack.top();
        minStack.getMin();
        System.out.println(minStack.toString());
    }
}
