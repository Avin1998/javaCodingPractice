package com.company.arrays.binarySearch;

public class ElementIndexInRotatedArray {
    public static void main(String args[]) {
        int[] arr = { 3,4,5,1,2};
        int target = 0;
        int index = findIndex(arr, target);
        System.out.println(search(arr, target));
        System.out.println(index);
    }
    static int findIndex(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int mid = 0;
        int n = arr.length;
        while(low <= high) {
            mid = (low + high) / 2;
            if(arr[mid] < arr[(mid + 1)%n] && arr[mid] < arr[(mid + n - 1)%n]) {
                break;
            }
            else {
                if(arr[high] < arr[mid]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
//        if( target > arr[arr.length - 1]){
//            int[] newArray = Arrays.copyOfRange(arr, 0 , mid );
//            return binarySearch(newArray , target);
//        }
//        else {
//            int[] newArray = Arrays.copyOfRange(arr, mid , arr.length );
//            return mid + binarySearch(newArray , target);
            return mid;
        }

    static int binarySearch(int[] arr , int target) {
        int high = arr.length - 1 , low = 0;
        int mid = 0;
        while (low <= high) {
            mid = (high + low) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return mid;
    }

    static int newSearch(int[] arr, int target) {
        int low = 0 , mid =0;
        int high = arr.length - 1;
        while(low<=high) {
            mid =(low+high) / 2;
            System.out.println(mid);
            if(arr[mid] == target) return mid;
            if(arr[low] < arr[mid]) {
                if( target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            else {
                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    public  static boolean search(int[] nums, int target) {
        int start = 0, end = nums.length - 1, mid = -1;
        while(start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] == target) {
                return true;
            }
            //If we know for sure right side is sorted or left side is unsorted
            if (nums[mid] < nums[end] || nums[mid] < nums[start]) {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
                //If we know for sure left side is sorted or right side is unsorted
            } else if (nums[mid] > nums[start] || nums[mid] > nums[end]) {
                if (target < nums[mid] && target >= nums[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                //If we get here, that means nums[start] == nums[mid] == nums[end], then shifting out
                //any of the two sides won't change the result but can help remove duplicate from
                //consideration, here we just use end-- but left++ works too
            } else {
                end--;
            }
        }

        return false;
    }
}
