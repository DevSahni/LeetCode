class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // Map each closing bracket to its corresponding opening bracket
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                // Push opening brackets onto the stack
                stack.push(c);
            } else {
                // Check if the stack is empty or if the top does not match
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If the stack is not empty, there are unmatched opening brackets
        return stack.isEmpty();
    }
}