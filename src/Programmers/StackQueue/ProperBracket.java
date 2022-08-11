package Programmers.StackQueue;

import java.util.Stack;

public class ProperBracket {
    boolean solution(String s) {

        Stack<Character>stack=new Stack<>();
        if(s.charAt(0)==')')
            return false;
        else {
            stack.push(s.charAt(0));
            for(int i=1;i<s.length();i++){
                if(stack.size()>0 && s.charAt(i) == ')') {
                    if(stack.peek() == '(')
                        stack.pop();
                    else
                        stack.push(s.charAt(i));
                }
                else
                    stack.push(s.charAt(i));
            }
        }
        boolean answer = stack.isEmpty() ? true:false;
        return answer;
    }
}
