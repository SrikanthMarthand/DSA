class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int wsum=0;
        for(int i=0;i<k;i++){
              wsum+=nums[i];
        }
        int msum=wsum;
        for(int i=k;i<nums.length;i++){
            wsum=wsum-nums[i-k]+nums[i];
            msum=Math.max(msum,wsum);
        }
        return (double)msum/k;
    }
}