// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// Peak index in a mountain array.

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // int mid = (start - end) / 2; It may exceed int value range
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid+1]){
                // I am in decreasing part of array (Right side of the mountain)
                // This may be the answer but I have to check at left side also
                end = mid;
            } else { //element[mid] < element[mid + 1]
                // I am in assending part of array. (Left side of the mountain)
                start = mid + 1;
            }
        }
        // Start and end pointing to the last number
        // Both start and end always trying to find maximum element in above two condition's check
        return start; // Or return end also
    }
}
