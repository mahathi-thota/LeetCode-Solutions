class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        
        // Step 1: Compute total sum of array
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        // Step 2: Iterate and compute leftSum, rightSum, and answer
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            answer[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i]; // update leftSum for next index
        }
        
        return answer;
    }
}
