class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> consecSet = new HashSet<>();
        for(int num : nums){
            consecSet.add(num);
        }
        int longStreak = 0;
        for(int num : consecSet){
            if(!consecSet.contains(num-1)){
            int currNum = num;
            int currStreak = 1;
            while(consecSet.contains(currNum+1)){
                currNum +=1;
                currStreak +=1;
            }
            longStreak = Math.max(longStreak,currStreak);
            }
        }
        return longStreak;
        
    }
}
