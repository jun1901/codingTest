package programmers.level1;

public class Solution39 { // 시저 암호 - https://programmers.co.kr/learn/courses/30/lessons/12926?language=java
    public static void main(String[] args) {
        String s = "AB";
        int n = 1;
        System.out.println(solution(s, n));
    }

    public static StringBuffer solution(String s, int n) {
        StringBuffer sb = new StringBuffer();
        int l = s.length();
        char c;
        for (int i = 0; i < l; i++) {
            c = s.charAt(i);
            if(c == ' ') sb.append(" ");
            else {
                c = (char)(c+n);
                if(c > 'z' || (c >'Z' && c-(char)n <= 'Z')) c -= 26;
                sb.append(c);
            }
        }
        return sb;
    }

}