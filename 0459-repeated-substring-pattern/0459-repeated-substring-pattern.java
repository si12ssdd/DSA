class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        for (int l = 1; l <= n / 2; l++) {

            // length must divide total length
            if (n % l == 0) {
                int times = n / l;

                String pattern = s.substring(0, l);
                String str = "";

                int count = 0;
                while (count < times) {
                    str += pattern;
                    count++;
                }

                if (str.equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}
