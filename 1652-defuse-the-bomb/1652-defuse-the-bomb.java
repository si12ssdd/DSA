class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];

        for(int i = 0; i < n; i++) {

            if(k == 0) {
                res[i] = 0;
            }

            else if(k > 0) {
                for(int j = 1; j <= k; j++) {
                    res[i] += code[(i + j) % n];
                }
            }

            else { // k < 0
                for(int j = 1; j <= Math.abs(k); j++) {
                    res[i] += code[((i - j) % n + n) % n];
                }
            }
        }

        return res;
    }
}