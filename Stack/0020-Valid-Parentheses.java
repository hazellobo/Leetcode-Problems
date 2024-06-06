class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for (char a : arr) {
            if (a == '(' || a == '[' || a == '{') {
                stack.push(a);
            } else {
                // Check if the stack is empty before using peek
                if (stack.isEmpty()) {
                    return false;
                }
                // Use logical AND (&&) instead of bitwise AND (&)
                if (a == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (a == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (a == '}' && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        // Check if the stack is empty after processing the string
        return stack.isEmpty();
    }
}