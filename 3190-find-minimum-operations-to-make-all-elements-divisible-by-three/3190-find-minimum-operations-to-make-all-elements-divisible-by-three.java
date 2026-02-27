class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for(int j : nums){
            if(j % 3 != 0 ){
                count ++;
            }
        }
        return count;
        
    }
}