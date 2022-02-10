package com.company.binarySearch;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] nums = {8,8,8};
        int target = 8;
        int firstIndex = findIndex(nums , target , true);
        System.out.println(firstIndex);
    }

    static int findIndex(int[] nums , int target , boolean isFirst) {
        int index = -1;
        int low = 0 , high = nums.length - 1;
        int mid = 0;
        int n = nums.length;
        while (low <= high) {
            mid = (low + high) / 2;
            if(nums[mid] < target) {
                low = mid + 1;
            }
            else if (nums[mid] > target) {
                high = mid - 1;
            }
            else {
                if(isFirst) {
                    if(nums[(mid + n - 1) % n] == nums[mid]) {
                        high = mid - 1;
                        index = mid;
                    }
                    else {
                        index = mid;
                        break;
                    }
                }
                else {
                    if(nums[(mid+1) % n] == nums[mid]){
                        low = mid + 1;
                        index = mid;
                    }
                    else {
                        index = mid;
                        break;
                    }

                }
            }
        }
        return index;
    }
}

