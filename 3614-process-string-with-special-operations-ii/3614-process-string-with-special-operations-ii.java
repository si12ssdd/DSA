class Solution {
    public char processStr(String s, long k) {
        int n = s.length();

        long[] len = new long[n + 1];
        len[0] = 0;

        long LIMIT = (long) 1e15 + 5;

        // Compute lengths after each operation
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                len[i + 1] = Math.min(LIMIT, len[i] + 1);
            } else if (ch == '*') {
                len[i + 1] = Math.max(0, len[i] - 1);
            } else if (ch == '#') {
                len[i + 1] = Math.min(LIMIT, len[i] * 2);
            } else { // '%'
                len[i + 1] = len[i];
            }
        }

        if (k >= len[n]) {
            return '.';
        }

        long curK = k;

        // Walk backwards
        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            long curLen = len[i + 1];

            if (ch >= 'a' && ch <= 'z') {
                if (curK == curLen - 1) {
                    return ch;
                }
            } else if (ch == '#') {
                long prevLen = len[i];
                curK %= prevLen;
            } else if (ch == '%') {
                curK = curLen - 1 - curK;
            }
            // '*' needs no index change
        }

        return '.';
    }
}