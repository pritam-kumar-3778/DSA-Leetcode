https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1};
        
        // check for first occurence if target first
        int start = search(nums, target, true);
        // check for last occurence if target first
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
        
    }

    // This function returns the index value of target
    int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
         int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            // int mid = (start - end) / 2; It may exceed int value range
            int mid = start + (end - start) / 2;
            if(target < nums[mid]){
                end = mid - 1;
            } 
            else if
            (target > nums[mid]){
                start = mid + 1;
            }
            else{
                ans = mid;
                if(findStartIndex == true){
                    end = mid - 1; //if first occurence is in left of mid
                } else {
                    start = mid + 1; //if last occurence is in right of the mid
                }
            }

        }
        return ans;
}
}