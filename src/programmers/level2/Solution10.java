package programmers.level2;

import java.util.Stack;

public class Solution10 {
    public static void main(String[] args) {
        String s = "cdcd";
        System.out.println(solution(s));
    }

    public static int solution(String s){
        Stack<Character> stack = new Stack<>();
        int l = s.length();
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if(!stack.isEmpty() && stack.peek() == c) stack.pop();
            else stack.push(c);
        }

        return stack.size() == 0 ? 1 : 0;
    }
}