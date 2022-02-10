package com.company.binarySearch;

public class SeachTwoDArray {
    public static void main(String[] args) {
        int[][] arr = {{1,4,7,11,15} , {2,5,8,12,19}};;
        int target = 1;
        int n = arr.length;
        int m = arr[0].length - 1;
        for(int[] newArray : arr) {
            if(target > newArray[m]) {
                continue;
            }
            else {
                System.out.println (binarySearch(newArray , target));
                break;
            }
        }
    }
    static boolean binarySearch(int[] arr , int target) {
        int low = 0 , high = arr.length - 1;
        int mid =0 ;
        while(low <= high) {
            mid = low + (high - low) / 2;
            if(arr[mid] == target) return true;
            if(arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
    }
}
