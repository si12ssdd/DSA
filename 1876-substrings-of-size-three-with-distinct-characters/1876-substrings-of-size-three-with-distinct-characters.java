class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0 ;
     
       for(int i = 0 ; i<=s.length()-3; i++){
        String sub  = s.substring(i , i+3);
        
         HashSet<Character> set = new HashSet<>();
        
        


        for(char c : sub.toCharArray()){
            set.add(c);
        }
        if(set.size() == 3){
            count++;
        }

     
       }
       return count;
    }
}