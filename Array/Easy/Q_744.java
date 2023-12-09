// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while(start <= end){
            // int mid = (start - end) / 2; It may exceed int value range
            int mid = start + (end - start) / 2;
            if(target < letters[mid]){
                end = mid - 1;
            } 
            else{
            start = mid + 1;
            }
            }


        return letters[start % letters.length]; //If target element is greater then or equal to last element of the array.
    }
}