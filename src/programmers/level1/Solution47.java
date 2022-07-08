package programmers.level1;

public class Solution47 { // 짝수와 홀수 - https://programmers.co.kr/learn/courses/30/lessons/12937?language=java
    public static void main(String[] args) {
        int num = 3;
        System.out.println(solution(num));
    }

    public static String solution(int num) {
        return num % 2 == 0? "Even" : "Odd";
    }

}