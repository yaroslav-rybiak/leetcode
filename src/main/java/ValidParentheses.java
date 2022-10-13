/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.
 */

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        Stack<Character> myStack = new Stack<>();
        for(char c: s.toCharArray()) {
            if(c=='{' | c=='[' | c=='(') {
                myStack.add(c);
            } else {
                if(c=='}') {
                    if(!myStack.isEmpty() && myStack.lastElement() == '{') {
                        myStack.pop();
                    } else return false;
                } else if(c==']') {
                    if(!myStack.isEmpty() && myStack.lastElement() == '[') {
                        myStack.pop();
                    } else return false;
                } else {
                    if(!myStack.isEmpty() && myStack.lastElement() == '(') {
                        myStack.pop();
                    } else return false;
                }
            }
        }
        return myStack.isEmpty();
    }
}
