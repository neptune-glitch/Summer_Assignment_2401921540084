class Solution {
    public int removeDuplicates(int[] nums) {
        int l=nums.length;
        if (l==0) {
            return 0;
        }
        int k = 1;
        for (int i=1;i<l;i++) {
            if (nums[i]!=nums[k - 1]) {
                nums[k]=nums[i];
                k++;
            }
        }
         return k;
    }
}
