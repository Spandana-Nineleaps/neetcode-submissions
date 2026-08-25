class Solution {
    public int longestConsecutive(int[] nums) {
        int[] numsCopy = nums.clone();
        Arrays.sort(numsCopy);
        int count = 1;
        int maxRun = 0;
        if(nums.length == 0){
            return 0;
        }
        for(int i=0;i<nums.length-1;i++){
            if(numsCopy[i] == numsCopy[i + 1]) continue;
            if((numsCopy[i] + 1) == numsCopy[i + 1]){
                count++;
            }else{
                maxRun = Math.max(maxRun,count);
                count = 1;
            }
        }
        return count > maxRun ? count : maxRun;
    }
}
