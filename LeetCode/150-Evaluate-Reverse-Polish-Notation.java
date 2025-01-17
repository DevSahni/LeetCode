class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        // Traverse each token in the RPN expression
        for (String token : tokens) {
            // If token is an operator
            if (token.equals(\+\) || token.equals(\-\) || token.equals(\*\) || token.equals(\/\)) {
                // Pop two operands
                int b = stack.pop();
                int a = stack.pop();
                
                // Apply the operator and push the result
                switch (token) {
                    case \+\:
                        stack.push(a + b);
                        break;
                    case \-\:
                        stack.push(a - b);
                        break;
                    case \*\:
                        stack.push(a * b);
                        break;
                    case \/\:
                        // Use integer division, handling negative numbers correctly
                        stack.push(a / b);
                        break;
                }
            } else {
                // If token is a number, push it to the stack
                stack.push(Integer.parseInt(token));
            }
        }

        // The result is the last remaining element in the stack
        return stack.pop();
    }
}