class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int target = threshold * k;
        int n = arr.length;
        int count = 0;
        int firstwindow = 0;

        for(int i = 0; i < k; i++){
            firstwindow += arr[i];
        }

        if(firstwindow >= target){
            count++;
        }

        for(int i = 1; i <= n-k; i++){
            firstwindow = firstwindow - arr[i-1] + arr[i+k-1];

            if(firstwindow >= target){
                count++;
            }
        }

        return count;
    }
}