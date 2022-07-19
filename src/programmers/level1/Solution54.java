package programmers.level1;

import java.util.Arrays;

public class Solution54 { // x만큼 간격이 있는 n개의 숫자 - https://programmers.co.kr/learn/courses/30/lessons/12954?language=java
    public static void main(String[] args) {
        int x = 2, n = 5;
        System.out.println(Arrays.toString(solution(x, n)));
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) answer[i] = (long)x * (i + 1);

        return answer;
    }

}