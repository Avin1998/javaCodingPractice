package com.company;

public class binarylowhighoccurence {
    public static void main(String[] args) {
        int arr[] = {1};
        int low = 0;
        int high = arr.length - 1;
        int mid = (int)Math.ceil((double)(low + high)/2.0);
        int element = 1;
        System.out.println(binary(arr,low,mid,high,element));
        System.out.println(binaryHighest(arr,low,mid,high,element));
    }
    static int binary (int [] arr , int low , int mid , int high, int elem) {
        int lowest = -1;
        boolean highest = true;
        while (low <= high) {
            if(elem == arr[mid]) {
                high = mid - 1;
                lowest = mid;
                mid = (int)Math.ceil((double)(low + mid)/2.0);
            }
            else if (elem > arr[mid]) {
                low = mid + 1;
                mid = (int)Math.ceil((double)(mid + high)/2.0);
            }
            else {
                high = mid - 1;
                mid = (int)Math.ceil((double)(low + mid)/2.0);
            }
        }
        return lowest;
    }
    static int binaryHighest (int [] arr , int low , int mid , int high, int elem) {
        int lowest = -1;
        while (low <= high) {
            if(elem == arr[mid]) {
                low = mid + 1;
                lowest = mid;
                mid = (int)Math.ceil((double)(high + mid)/2.0);
            }
            else if (elem > arr[mid]) {
                low = mid + 1;
                mid = (int)Math.ceil((double)(mid + high)/2.0);
            }
            else {
                high = mid - 1;
                mid = (int)Math.ceil((double)(low + mid)/2.0);
            }
        }
        return lowest;
    }
}
