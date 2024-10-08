package com.leet.code.week.one;

import java.util.Stack;

public class ValidParentheses {
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> charStack = new Stack();
            for(int i=0; i<s.length(); i++) {
                if(charStack.isEmpty()) {
                    charStack.push(s.charAt(i));
                    continue;
                }
                if(s.charAt(i) == ')' && charStack.peek() == '(') {
                    charStack.pop();
                    continue;
                }
                if(s.charAt(i) == '}' && charStack.peek() == '{') {
                    charStack.pop();
                    continue;
                }
                if(s.charAt(i) == ']' && charStack.peek() == '[') {
                    charStack.pop();
                    continue;
                }
                charStack.push(s.charAt(i));
            }
            return charStack.isEmpty();
        }
    }
}
