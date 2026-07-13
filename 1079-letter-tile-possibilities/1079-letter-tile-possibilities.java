class Solution {

    int count = 0;

    public int numTilePossibilities(String tiles) {
        int[] freq = new int[26];

        for (char ch : tiles.toCharArray()) {
            freq[ch - 'A']++;
        }

        backtrack(freq);

        return count;
    }

    private void backtrack(int[] freq) {

        for (int i = 0; i < 26; i++) {

            if (freq[i] == 0)
                continue;

            // Choose
            freq[i]--;

            // A new sequence is formed
            count++;

            // Explore further
            backtrack(freq);

            // Undo the choice
            freq[i]++;
        }
    }
}