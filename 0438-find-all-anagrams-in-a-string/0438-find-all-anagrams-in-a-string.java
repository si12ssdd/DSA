class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length()) {
            return ans;
        }

        int[] count = new int[26];

        // Count characters of p
        for (char c : p.toCharArray()) {
            count[c - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character of s to window
            count[s.charAt(right) - 'a']--;

            // Window size == p size
            if (right - left + 1 == p.length()) {

                boolean valid = true;

                // Check if frequencies match
                for (int i = 0; i < 26; i++) {
                    if (count[i] != 0) {
                        valid = false;
                        break;
                    }
                }

                if (valid) {
                    ans.add(left);
                }

                // Remove left character from window
                count[s.charAt(left) - 'a']++;
                left++;
            }
        }

        return ans;
    }
}