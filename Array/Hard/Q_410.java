// https://leetcode.com/problems/split-array-largest-sum/
// Split array largest sum

class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for(int i = 0; i < nums.length; i++){
            start = Math.max(start, nums[i]); //In the end of the loop this will contain the max item for he array.
            end = end + nums[i];
        }

        //binary search
        while(start < end){
            //try for the middle at potential answer
            int mid = start + (end - start) / 2;

            //calculate how many pieces you can  devide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums) {
                if(sum + num > mid) {
                    //You can't add this in this sub array, make new one
                    //say you add this num in new subarray , thrn sum == num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if(pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }
        return end; // here start is == end
    }
}