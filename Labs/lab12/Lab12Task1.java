/*
 * Lab 12, Task 1
 * CS 112
 */

public class Lab12Task1 {
    /*
     * isLeftDelim - takes a single character ch and returns true
     * if it is a left delimiter -- a (, [, or { -- and false otherwise.
     */
    public static boolean isLeftDelim(char ch) {
        return (ch == '(' || ch == '[' || ch == "{");
    }
    
    /*
     * isRightDelim - takes a single character ch and returns true
     * if it is a right delimiter -- a ), ], or } -- and false otherwise.
     */
    public static boolean isRightDelim(char ch) {
        return (ch == ')' || ch == ']'|| ch == "}");
    }
    
    /*
     * matches - takes two characters left and right, and checks to see 
     * if they are matching left and right delimiters, returning true
     * if they are, and false if they are not.
     */
    public static boolean matches(char left, char right) {
        if (left == '(' && right == ')') {
            return true;
        } else if (left == '[' && right == ']') {
            return true;
        } else {
            return false;
        }
    }
    
    /*
     * isBalanced - takes a String expr that represents a mathematical 
     * expression and determines if its delimiters are properly balanced, 
     * returning true if they are and false otherwise.
     */
    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new LLStack<Character>();
        
        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);
            if (isLeftDelim(ch)) {
                stack.push(ch);
            } 
            else if (isRightDelim(ch)){
                if(stack.isEmpty())
                    return false;
                if(!matches(stack.pop(),ch))
                    return false;
            }
        }
        
        return false;
    }
}
        
