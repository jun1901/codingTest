package programmers.level1;

public class Solution38 { // 문자열을 정수로 바꾸기 - https://programmers.co.kr/learn/courses/30/lessons/12925?language=java
    public static void main(String[] args) {
        String s = "-1234";
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        return Integer.parseInt(s);
    }

}