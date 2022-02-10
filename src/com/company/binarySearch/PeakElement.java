package com.company.binarySearch;

public class PeakElement {
    public static void main(String[] args) {
        int arr[] = {1,2};
        System.out.println(findPeakElement(arr));
    }
    public static int findPeakElement(int[] nums) {
        int low = 0, high = nums.length - 1;
        if(nums.length == 1) return 0;
        while(low<=high) {
            int mid = low + (high - low)/2;
            System.out.println(mid);
            if(mid != 0 && mid != nums.length - 1) {
                if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]) {
                    return mid;
                }
                else if(nums[mid+1] >= nums[mid]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
            else if (mid == 0) {
                if(nums[mid] > nums[mid + 1]) return mid;
                else {
                    low += 1;
                }
            }
            else { if(nums[mid] > nums[mid - 1]) return mid; else break;}
        }
        return -1;
    }
}
