package programmers.level1;

public class Solution30 { // 두 정수 사이의 합 - https://programmers.co.kr/learn/courses/30/lessons/12912?language=java
    public static void main(String[] args) {
        int a = 3, b = 5;
        System.out.println(solution(a,b));
    }

    public static long solution(int a, int b) {
        return (long) (a + b) * (Math.abs(a - b) + 1) / 2;
    }

}