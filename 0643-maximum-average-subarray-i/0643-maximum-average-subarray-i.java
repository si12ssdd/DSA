class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowsum = 0 ;
        int n = nums.length;
        for(int i = 0 ; i<k ; i++){
            windowsum+=nums[i];
        }
        int maxsum = windowsum;
        for(int i = 0 ; i < n-k;i++){
           windowsum = windowsum - nums[i] + nums[i+k];
            maxsum = Math.max(maxsum , windowsum) ;
        }

        return (double) maxsum / k;

    }
}