class Solution {
    public long sumAndMultiply(int n) {

        long result = 0;      // changed
        long place = 1;       // can also be long
        int digitSum = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit != 0) {
                result += (long) digit * place;
                place *= 10;
            }

            digitSum += digit;
            n /= 10;
        }

        return result * digitSum;
    }
}