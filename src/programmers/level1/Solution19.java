package programmers.level1;

import java.util.Arrays;

public class Solution19 { // 예산 - https://programmers.co.kr/learn/courses/30/lessons/12982?language=java
    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;
        System.out.println(solution(d, budget));
    }

    public static int solution(int[] d, int budget) {
        int answer = 0, sum = 0,l;
        Arrays.sort(d);
        l = d.length;
        for (int i = 0; i < l; i++) {
            sum += d[i];
            if(sum > budget) break;
            answer++;
        }
        return answer;
    }



}