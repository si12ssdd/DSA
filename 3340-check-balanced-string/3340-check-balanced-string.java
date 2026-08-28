class Solution {
    public boolean isBalanced(String num) {

        int evensum = 0 ; 
        int oddsum = 0 ; 

        for(int i = 0 ;  i < num.length() ; i++){
            int digit = num.charAt(i) - '0'; // just we use to convert char to num ; 
            


            if( i % 2 ==  0){
                evensum+=digit;
            }
            else{
                oddsum+=digit;
            }
        }
     return evensum == oddsum;
    }
}