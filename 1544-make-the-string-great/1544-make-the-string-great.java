class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){

            if(!stack.isEmpty()){
                char top = stack.peek();

                if(Math.abs(top - ch) == 32){
                    stack.pop();
                    continue;
                }
            } 


stack.push(ch);


        }

        StringBuilder result = new StringBuilder();
        for(char ch : stack){
            result.append(ch);
        }

        return result.toString();
        
    }
}