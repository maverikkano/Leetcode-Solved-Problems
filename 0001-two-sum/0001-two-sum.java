class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // element : index
        Map<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
        
        // One-pass Hash Table method
        for(int i=0; i<nums.length; i++) {
            Integer index = indexMap.get(target-nums[i]);
            if(index != null) {

                return new int[]{index,i};

            } else {

                indexMap.put(nums[i],i);

            }

        }

        return new int[]{};

    }
}