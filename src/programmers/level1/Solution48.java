package programmers.level1;

import java.util.Arrays;

public class Solution48 { // 최대공약수와 최소공배수 - https://programmers.co.kr/learn/courses/30/lessons/12940?language=java
    public static void main(String[] args) {
        int n = 1000000, m = 1000000;
        System.out.println(Arrays.toString(solution(n, m)));
    }

    public static long[] solution(int n, int m) {
        long[] answer = {1,(long)n*m};
        for (int i = Math.min(n,m); i > 0; i--) {
            if(n%i==0 && m%i == 0) {
                answer[0] = i;
                answer[1] /= i;
                break;
            }
        }

        return answer;
    }

}