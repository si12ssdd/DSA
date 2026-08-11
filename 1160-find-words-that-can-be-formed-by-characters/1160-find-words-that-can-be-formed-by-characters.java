class Solution {
    public int countCharacters(String[] words, String chars) {
       int[] avail = new int [26];

       for(char ch : chars.toCharArray()){
        avail[ch - 'a']++;
       }

       int ans = 0 ; 

       for (String word : words){
        int [] need = new int[26];

        for(char ch : word.toCharArray()){
            need[ch - 'a']++;
        }

        boolean valid = true;


        for (int i = 0 ; i < 26 ; i++){
            if( need[i] > avail[i]){
                valid = false;
                break ; 
            }
        }
        if(valid){
            ans+=word.length();
        }
       }
       return ans;
    }
}