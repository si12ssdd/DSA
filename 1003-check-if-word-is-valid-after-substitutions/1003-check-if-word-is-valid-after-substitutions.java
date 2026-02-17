class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            stack.push(ch);


            if(stack.size()>=3){
                int size = stack.size();

                if(stack.get(size - 3) == 'a' &&
                stack.get(size - 2) == 'b' && 
                stack.get(size -1) == 'c'){
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }
}