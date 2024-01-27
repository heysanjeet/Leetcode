class Solution {
    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char chars = s.charAt(i);
            if (chars == '(' || chars == '{' || chars == '[') {
                stack.push(chars);
            } else {
                if (stack.isEmpty() == true) {
                    return false;
                } else if (matching(stack.peek(), chars) == false) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return (stack.isEmpty() == true);
    }

    private boolean matching(char a, char b) {
        return ((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']'));
    }
    
    //loop through each character in the string, 
    //if the character is an opening parenthesis, push the corresponding closing parenthesis onto the stack
    //
    public boolean isValid(String s){
        Stack<Character> stack=new Stack<Character>();
        for(char c: s.toCharArray()){
            if(c=='('){
                stack.push(')');
            }else if(c=='{'){
                stack.push('}');
            }else if(c=='['){
                stack.push(']');
            }else if(stack.isEmpty() || stack.pop() !=c){
               // if the character is a closing bracket
                // if the stack is empty (i.e., there is no matching opening bracket) or the top of the stack
                // does not match the closing bracket, the string is not valid, so return false
                return false;
            }
        }
         // if the stack is empty, all opening brackets have been matched with their corresponding closing brackets,
        // so the string is valid, otherwise, there are unmatched opening brackets, so return false
        return stack.isEmpty();
    }
}