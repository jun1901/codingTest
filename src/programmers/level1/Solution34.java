package programmers.level1;

public class Solution34 { // 문자열 다루기 기본 - https://programmers.co.kr/learn/courses/30/lessons/12918?language=java
    public static void main(String[] args) {
        String s = "1234";
        System.out.println(solution(s));
    }

    public static boolean solution(String s) {
        int l = s.length();
        if(l == 4 || l ==6) return s.matches("[0-9]*");
        return false;
        /*
        int l = s.length();
        if(l != 4 && l !=6) return false;
        s = s.replaceAll("[^0-9]","");

        return l == s.length();
        */
    }

}