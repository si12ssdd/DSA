class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double minavg = Double.MAX_VALUE;
        int i = 0 ; 
        int j = nums.length - 1;
        while(i<j){
            double avg = (nums[i] + nums[j]) / 2.0;
            minavg = Math.min(minavg , avg);
            i++;
            j--;
        }
        return minavg;
    }
}