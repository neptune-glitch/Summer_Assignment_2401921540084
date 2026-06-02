class Solution {
    public boolean containsDuplicate(int[] nums) {
        int count=0;
        int n=nums.length;
        for (int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (nums[i]==nums[j]){
                    count++;
                }
            }
        }
        if (count>=1){
            return true;
            }
        else{
            return false;
            }
            
        
        
    }
}
