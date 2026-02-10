class Solution {
    public int maxSubArray(int[] nums) {
        
       /* int maxsum = Integer.MIN_VALUE;   // 

        for(int i = 0; i < nums.length; i++){
            int sum = 0;

            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                maxsum = Math.max(maxsum, sum);
            }
        }
        //return maxsum;
    }
}*/







        int m = nums[0];
        int c = nums[0];

        for(int i = 1;i<nums.length;i++){
            c = Math.max(nums[i], c+nums[i]);
            m = Math.max(m,c);
            
        }

        return m; 
    }
}
        



    