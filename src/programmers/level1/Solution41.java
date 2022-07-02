package programmers.level1;

public class Solution41 { // 이상한 문자 만들기 - https://programmers.co.kr/learn/courses/30/lessons/12930?language=java
    public static void main(String[] args) {
        String s = "try hello world";
        System.out.println(solution(s));
    }

    public static StringBuffer solution(String s) {
        StringBuffer answer = new StringBuffer();
        int l = s.length();
        char c;
        for (int i = 0,j = 0; i < l; i++, j++) {
            c = s.charAt(i);
            if(c == ' '){
                answer.append(" ");
                j = -1;
            } else {
                if(j%2 == 0) answer.append(Character.toUpperCase(c));
                else answer.append(Character.toLowerCase(c));
            }
        }

        return answer;
    }

}