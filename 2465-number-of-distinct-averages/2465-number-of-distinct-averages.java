class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();

        int i = 0 ;
        int j = nums.length-1;
        while(i<j){
            int avg = (nums[i]+nums[j]);
            set.add(avg);

            i++;
            j--;
        }
      return set.size();

    }
}