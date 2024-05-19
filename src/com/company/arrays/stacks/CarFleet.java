package com.company.arrays.stacks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class CarFleet {
    public static void main(String[] args) {
        int[] position = new int[]{10,8,0,5,3};
        int[] speed = new int[]{2,4,1,1,3};
        int target = 12;

        int[][] positionWithSpeed = new int[position.length][2];

        for(int i = 0; i < position.length; i++) {
            positionWithSpeed[i][0] = position[i];
            positionWithSpeed[i][1] = speed[i];
        }
        Arrays.sort(positionWithSpeed,new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });

        Stack<int[]> transientResult = new Stack<>();

        int calculateDistanceFromTarget, calculateLastCarDistanceFromTarget;
        for(int j = positionWithSpeed.length - 1; j >= 0; j--) {
            if(transientResult.isEmpty()) {
                transientResult.push(positionWithSpeed[j]);
            } else {
                calculateDistanceFromTarget = (target - positionWithSpeed[j][0]) / positionWithSpeed[j][1];
                calculateLastCarDistanceFromTarget = (target - transientResult.peek()[0]) / transientResult.peek()[1];
                if(calculateDistanceFromTarget > calculateLastCarDistanceFromTarget) {
                    transientResult.add(positionWithSpeed[j]);
                }
            }
        }

        System.out.println(transientResult.size());
    }
}
