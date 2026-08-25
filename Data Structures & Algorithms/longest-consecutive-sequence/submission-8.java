class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> numSet = new HashSet<>();
        for(int i:nums){
            numSet.add(i);
        }
        int maxRun = 0;
        for(int n:numSet){
            if(!numSet.contains(n - 1)){
                int currentNum = n;
                int currentRun = 1;
            
            while(numSet.contains(currentNum +1)){
                currentNum++;
                currentRun++;
            }
            maxRun = Math.max(maxRun,currentRun);
            }
        }
        return maxRun;
    }
}
