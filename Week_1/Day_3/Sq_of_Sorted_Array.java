class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=nums.length;
        int[] sq=new int[l];
        for (int i=0;i<l;i++){
            sq[i]=nums[i]*nums[i];
        }
        for (int i=0;i<l-1;i++){
            for (int j=0;j<l-i-1;j++){
                if (sq[j]>sq[j+1]){
                    int temp= sq[j];
                    sq[j]=sq[j+1];
                    sq[j+1]= temp;

                }

                
            }

        }
        return sq;
    }
}
