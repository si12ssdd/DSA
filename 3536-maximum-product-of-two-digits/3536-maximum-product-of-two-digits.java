class Solution {
    public int maxProduct(int n) {
        String s = Integer.toString(n);
        int max1 = -1, max2 = -1; // max1 >= max2
        
        for (char c : s.toCharArray()) {
            int d = c - '0';
            if (d > max1) {
                max2 = max1;
                max1 = d;
            } else if (d > max2) {
                max2 = d;
            }
        }
        
        return max1 * max2;
    }
}