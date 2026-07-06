class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> original = new HashSet();
        for(int i=0;i<nums.length;i++){
            if(original.contains(nums[i])) return true;
            else original.add(nums[i]);
        } 
        return false;
    }
}