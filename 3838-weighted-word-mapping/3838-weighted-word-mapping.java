class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

        StringBuilder ans = new StringBuilder();

        for (String word : words) {
            int sum = 0;

            // calculate weight of current word
            for (char ch : word.toCharArray()) {
                sum += weights[ch - 'a'];
            }

            int mod = sum % 26;

            // reverse alphabet mapping
            char mapped = (char) ('z' - mod);

            ans.append(mapped);
        }

        return ans.toString();
    }
}