package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution14 { // 체육복 - https://programmers.co.kr/learn/courses/30/lessons/42862?language=java
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,4}, reserve = {3};
        System.out.println(solution(n,lost,reserve));
    }

    public static int solution(int n, int[] lost, int[] reserve) {

        int answer = 0;
        int[] total = new int[n+2];
        Arrays.fill(total,1);
        for (int i: lost) total[i]--;
        for (int i: reserve) total[i]++;
        System.out.println(Arrays.toString(total));
        for (int i = 1; i <= n; i++) {
            if(total[i] >= 1) answer++;
            else if(total[i] == 0){
                if(total[i-1] == 2){
                    total[i-1]--;
                    answer++;
                }else if(total[i+1] == 2){
                    total[i+1]--;
                    answer++;
                }
            }
        }
        System.out.println(Arrays.toString(total));


/* 문제있는 코드
        int answer = n - lost.length;
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if(reserve[j] != -2 && lost[i] == reserve[j]){
                    answer++;
                    lost[i] = reserve[j] =-2;
                }
            }
        }
        System.out.println(Arrays.toString(lost));
        System.out.println(Arrays.toString(reserve));

        for (int i = 0; i < lost.length; i++) {
            if(lost[i] > 0){
                for (int j = 0; j < reserve.length; j++) {
                    if(reserve[j] != -2 && (lost[i]-1 == reserve[j] ||lost[i]+1 == reserve[j])){
                        answer++;
                        reserve[j] =-2;
                        System.out.println(Arrays.toString(reserve));
                    }
                }
            }
        }

         */
        return answer;
    }



}
