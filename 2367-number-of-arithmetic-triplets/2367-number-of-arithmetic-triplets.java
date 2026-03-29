class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {

            int x = nums[i];

            if(set.contains(x - diff) && set.contains(x - 2 * diff)) {
                count++;
            }

            set.add(x);
        }

        return count;
    }
}