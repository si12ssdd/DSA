class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] c1 = new int[26];
        int [] c2 = new int[26];

        for( char ch : s.toCharArray()){
            c1[ch - 'a']++;
        }

        for(char ch : target.toCharArray()){
            c2[ch - 'a']++;
        }

        int ans = Integer.MAX_VALUE;
        for(int i =  0; i < 26 ; i++){
            if(c2[i] > 0){
                ans = Math.min( ans , c1[i] / c2[i]);
            }
        }
        return ans;
    }
}