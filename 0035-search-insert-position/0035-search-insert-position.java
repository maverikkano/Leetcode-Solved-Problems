class Solution {
    public int searchInsert(int[] nums, int target) {
        
        // Binary search
        int start=0, end=nums.length-1;
        int pointer=0;
        
        while( start <= end ) {
            pointer =  start + (end - start) / 2;
                
            if(nums[pointer] == target) {
                return pointer;
            } else if (nums[pointer] < target) {
                start = pointer+1;
            } else {
                end = pointer-1;
            }
            
        }
        return start;
    }
}