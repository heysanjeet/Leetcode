class Solution {
    public boolean isValid(String s) {
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
}