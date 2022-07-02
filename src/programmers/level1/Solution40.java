package programmers.level1;

public class Solution40 { // 약수의 합 - https://programmers.co.kr/learn/courses/30/lessons/12928?language=java
    public static void main(String[] args) {
        int n = 0;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0, sqrt = (int)Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) if(n%i == 0) answer += i + (i == sqrt ? 0 : n/i);


        return answer;
    }

}