class Solution {
    public boolean areOccurrencesEqual(String s) {
        int [] count = new int[26];

        for(char ch : s.toCharArray()){
            count [ch - 'a']++;
        }

        int freq = 0 ; 

        for (int i = 0 ; i < 26 ; i ++){
            if(count[i] >  0){
                freq = count[i];
            }
        }

        for (int i = 0 ; i < 26 ; i ++){
            if( count[i] > 0 && count[i] != freq){
                return false;
            }
        }
        return true;
    }
}