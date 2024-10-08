package com.leet.code.week.one;

import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 *
 * Output: true
 *
 * Example 2:
 *
 * Input: s = "()[]{}"
 *
 * Output: true
 *
 * Example 3:
 *
 * Input: s = "(]"
 *
 * Output: false
 *
 * Example 4:
 *
 * Input: s = "([])"
 *
 * Output: true
 *
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 *
 */
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
