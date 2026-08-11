class Solution {
    public String frequencySort(String s) {

        int [] count = new int [128];

        for ( char ch : s.toCharArray()){
            count[ch ] ++;
        }
        StringBuilder sb = new StringBuilder();

        for ( int k = 0 ; k < 128 ; k++){
            int maxfreq = 0 ;
            int maxchar = 0 ; 

            for(int i = 0 ; i < 128 ; i++){
                if(count[i] > maxfreq){
                    maxfreq = count[i];
                    maxchar = i;
                }
            }
            if(maxfreq == 0){
                break ;
            }
            while( count[maxchar] > 0){
                sb.append((char)maxchar);
                count[maxchar]--;
            }
        }
        return sb.toString();
        
    }
}