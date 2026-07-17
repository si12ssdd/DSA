class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder ans = new StringBuilder();
        Stack <Integer> stack = new Stack<>();
         int num = 1 ;

         for (int i = 0 ; i < pattern.length(); i++){
            stack.push(num++);
            if(pattern.charAt(i) == 'I'){
                while(!stack.isEmpty()){
                    ans.append(stack.pop());
                }
            }
         }

         stack.push(num);

         while(!stack.isEmpty()){
            ans.append(stack.pop());
         }
        
        return ans.toString();
    }
}