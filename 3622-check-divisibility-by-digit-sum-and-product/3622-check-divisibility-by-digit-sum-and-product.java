class Solution {
    public boolean checkDivisibility(int n) {
        int org = n;
        int sum = 0 ;
        int product = 1;

        while(n>0){
            int digit = n % 10;

            sum = sum + digit ;
            product = product * digit;

            n = n / 10; 
        }

        int value = sum + product;

        return org % value == 0;
    }
}