class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        long windowSum = 0;
        long maxSum = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
      
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                windowSum -= nums[left];
                left++;
            }

   
            set.add(nums[right]);
            windowSum += nums[right];

          
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, windowSum);
      
                set.remove(nums[left]);
                windowSum -= nums[left];
                left++;
            }
        }

        return maxSum;
    }
}