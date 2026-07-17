class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int ans = 0 ;
        int g = -1 ;
        int p = - 1;
        int m = -1 ;

        for(int i = 0 ; i < garbage.length; i++){

            String s = garbage[i];
            
            ans += s.length();

            if(s.contains("G")){
                g = i;
            }
            if(s.contains("P")){
                p = i;
            }
            if(s.contains("M")){
                m = i;
            }
        }

            for(int i  = 0 ; i < g ; i++){
                ans += travel[i];

            }
            for(int i = 0 ; i < p ; i++){
                ans += travel[i];
            }
            for(int i = 0 ; i<m ; i++){
                ans+= travel[i];
            }
            return ans;
        }
}