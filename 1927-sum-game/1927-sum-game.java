class Solution {
    public boolean sumGame(String num) {

        int n = num.length();

        int leftKnownSum = 0;
        int rightKnownSum = 0;

        int leftQnMarkCount = 0;
        int rightQnMarkCount = 0;

        for (int i = 0; i < n; i++) {

            if (num.charAt(i) == '?') {

                if (i < n / 2) {
                    leftQnMarkCount++;
                } else {
                    rightQnMarkCount++;
                }

            } else {

                int digit = num.charAt(i) - '0';

                if (i < n / 2) {
                    leftKnownSum += digit;
                } else {
                    rightKnownSum += digit;
                }
            }
        }

        int totalQnMarks = leftQnMarkCount + rightQnMarkCount;

        // Odd number of '?' means Alice always wins
        if (totalQnMarks % 2 == 1) {
            return true;
        }

        int LEFT = 2 * leftKnownSum + 9 * leftQnMarkCount;
        int RIGHT = 2 * rightKnownSum + 9 * rightQnMarkCount;

        // Bob wins if both sides can be made equal
        if (LEFT == RIGHT) {
            return false;
        }

        return true;
    }
}