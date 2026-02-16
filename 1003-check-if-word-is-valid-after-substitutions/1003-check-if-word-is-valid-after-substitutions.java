public class Solution {
    public boolean isValid(String s) {

      /*  while (s.contains("abc")) {
            s = s.replace("abc", "");
        }

        return s.length() == 0; */


        


        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            stack.push(ch);

            // Whenever stack size >= 3, check top 3 characters
            if (stack.size() >= 3) {
                int size = stack.size();

                if (stack.get(size - 3) == 'a' &&
                    stack.get(size - 2) == 'b' &&
                    stack.get(size - 1) == 'c') {

                    // Remove "abc"
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }
}


