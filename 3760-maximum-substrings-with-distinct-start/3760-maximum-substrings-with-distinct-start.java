class Solution {
    public int maxDistinct(String s) {
           Set<Character> set = new HashSet<>();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
                count++;
            }
        }

        return count;
    }
}
    