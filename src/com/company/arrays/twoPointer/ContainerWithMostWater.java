package com.company.arrays.twoPointer;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int [] height = new int[] {1,8,6,2,5,4,8,3,7};

        int i = 0, j = height.length - 1, waterQuantity = Integer.MIN_VALUE, currentWaterQuantity = 0;

        while(i < j) {
            currentWaterQuantity = Math.min(height[i], height[j]) * (j-i);
            waterQuantity = Math.max(waterQuantity, currentWaterQuantity);
            if(height[i] <= height[j]) {
                i++ ;
            } else { j--; }
        }
        System.out.println(waterQuantity);
    }
}
