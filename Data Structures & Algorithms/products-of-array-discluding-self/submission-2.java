class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
    
        int runningLeft = 1;
        for (int i = 0; i < nums.length; i++) {
            output[i] = runningLeft;
            runningLeft *= nums[i];
        }
        
        int runningRight = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= runningRight;
            runningRight *= nums[i];
        }
        return output;
    }
}  
