class Solution {
    public int dominantIndices(int[] nums) {
        int count = 0 ; 
        for( int i = 0 ; i<nums.length;i++){
            long sum = 0 ; 
            for(int j = i; j<nums.length;j++){
                sum = sum + nums[j];
            }
            if(nums[i]>sum/(nums.length-i)){
                count++;
            }
        }
        return count;

    }
}