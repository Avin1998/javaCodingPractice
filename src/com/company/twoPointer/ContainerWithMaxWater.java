package com.company.twoPointer;

public class ContainerWithMaxWater {
    public static void main(String[] args) {
        int nums[] = { 1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
    }
    public static int maxArea(int[] height) {
        int i = 0 , j = height.length - 1;
        int result = 0;
        while(i<j) {
            result = Math.max(result , Math.min(height[i],height[j]) * (j -i));
            if(height[i] < height[j])
                i++;
            else
                j--;
        }
        return result;
    }
}
