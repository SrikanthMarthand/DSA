class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int fsum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum1 = nums[i] + nums[left] + nums[right];

                // Check if this sum is closer to target
                if (Math.abs(sum1 - target) < Math.abs(fsum - target)) {
                    fsum = sum1;
                }

                // Decide which pointer to move
                if (sum1 < target) {
                    left++;
                } 
                else if (sum1 > target) {
                    right--;
                } 
                else {
                    return target;
                }
            }
        }

        return fsum;
    }
}