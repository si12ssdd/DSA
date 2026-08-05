import java.util.*;

class Solution {

    public String sortVowels(String s) {

        List<Character> vowels = new ArrayList<>();
        for (char ch : s.toCharArray()){
            if(isVowel(ch)){
                vowels.add(ch);
            }
        }
        Collections.sort(vowels);

        char [] arr = s.toCharArray();
        int index = 0 ;

        for(int i = 0 ; i < arr.length ; i++){
            if(isVowel(arr[i])){
                arr[i] = vowels.get(index++);
            }
        }
        return new String(arr);
    }



    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}