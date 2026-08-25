class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int runningLeftIndex = 1;
        for(int i=0;i<nums.length;i++){
            prefix[i] = runningLeftIndex;
            runningLeftIndex *= nums[i];
        }
        int runningRightIndex = 1;
        for(int i=nums.length-1;i>=0;i--){
            suffix[i] = runningRightIndex;
            runningRightIndex *= nums[i];
        }
        for(int i=0;i<nums.length;i++){
            output[i] = prefix[i] * suffix[i];
        }
        return output;
    }
}  
