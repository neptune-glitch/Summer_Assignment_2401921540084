class Solution {
    public int maxSubArray(int[] nums) {
        int current =0;
        int max=nums[0];
        int n= nums.length;
        for (int i=0;i<n;i++){
            current=Math.max(nums[i],nums[i]+current);
            max=Math.max(current,max);

        }
        return max;
        
    }
}
