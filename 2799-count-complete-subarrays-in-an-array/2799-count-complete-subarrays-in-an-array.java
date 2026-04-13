class Solution {
    public int countCompleteSubarrays(int[] nums) {
           int n = nums.length;

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int k = set.size(); 

        int count = 0; 

        for(int i = 0 ; i < n; i++){
            HashSet<Integer> temp = new HashSet<>();

            for(int j = i ; j < n ; j++){
                temp.add(nums[j]);

                if(temp.size() == k){
                    count++;
                }
            }
        }

        return count;
    }
}