class Solution {
    public int[] resultArray(int[] nums) {

        int [] arr1 = new int[nums.length];
        int [] arr2 = new int[nums.length];

        arr1[0] = nums[0];
        arr2[0] = nums[1];

        int size1 = 1 ; 
        int size2 = 1;

        for ( int i = 2; i < nums.length ; i++){
            if(arr1[size1 - 1 ] > arr2[size2 - 1]){
                arr1[size1] = nums[i];
                size1++;
            }
            else{
                arr2[size2] = nums[i];
                size2++;
            }
        }

        int [] result = new int [ nums.length];

        for (int i = 0 ; i < size1 ; i ++){
            result[i] = arr1[i];
        }

        for(int i = 0 ; i < size2 ; i++){
            result[size1 + i] = arr2[i];
        }


        


return result;

        
    }
}