class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double window=0;
        double max=0;
        double avg=0;
        
        
        for (int i=0;i<k;i++){
            window+=nums[i];
            avg=window/k;
            max=avg;

        }
        for(int i=k;i<n;i++){
            window+=nums[i];
            window-=nums[i-k];
            max=Math.max(max,window/k);
        }
        return max;
        
    }
}
