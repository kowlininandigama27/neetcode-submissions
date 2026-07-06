class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> freqMap = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(freqMap.get(target-nums[i])!=null){
                return new int[] {freqMap.get(target-nums[i]),i};
            }
            else{
                freqMap.put(nums[i],i);
            }
        }
        return new int[] {-1,-1};
        
    }
}
