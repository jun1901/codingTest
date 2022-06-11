package programmers.level1;

import java.util.*;

public class Solution16 { // 실패율 - https://programmers.co.kr/learn/courses/30/lessons/42889?language=java
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {4,4,4,4,4};
        System.out.println(Arrays.toString(solution(N,stages)));
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N], pass = new int[N], now = new int[N];
        TreeMap<Double, ArrayList<Integer>> hm = new TreeMap<>();
        int n, index=0;
        double s;

        for (int i = 0; i < stages.length; i++) {
            n = stages[i]-1;
            if(n >= N) n = N-1;
            else now[n]++;
            for (int j = 0; j <= n; j++) pass[j]++;
        }

        for (int i = 0; i < N; i++) {
            s = pass[i] != 0 ? now[i]*1.0/pass[i] : 0;
            if(!hm.containsKey(s)) hm.put(s,new ArrayList<>());
            hm.get(s).add(i+1);
        }

        System.out.println(Arrays.toString(pass));
        System.out.println(Arrays.toString(now));

        for (Double d: hm.descendingKeySet()) for (int i: hm.get(d)) answer[index++] = i;

        return answer;
    }

}
