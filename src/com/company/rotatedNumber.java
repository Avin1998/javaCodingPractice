package com.company;

public class rotatedNumber {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,1,2,3};
        int target = 3;
        int zeroIndex = findZerothIndex( arr );
        int searchTarget = binarySearch(arr,0,zeroIndex - 1, target);
        if (searchTarget == -1)
        {
            searchTarget = binarySearch(arr,zeroIndex,arr.length - 1, target);
        }
        System.out.println(searchTarget);
    }
    static int binarySearch(int arr[], int low, int high , int target ){

        while (low <= high) {
            int mid = low + (high -low)/2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (target > arr[mid] ) {
                low = mid +1;
            }
            else {
                high = mid - 1;
            }
        }
        return  -1;
    }
    static int findZerothIndex(int[] arr) {
        int low = 0;
        int index = -1;
        int n = arr.length;
        int high = arr.length - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low)/2;
            if ((arr[(mid+n-1)%n] > arr[mid] )&& (arr[mid] < arr[(mid + 1)%n])) {
                return mid;
            }
            else if ((arr[mid] > arr[low]) && (arr[mid] > arr[high])) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return index;
    }
}
