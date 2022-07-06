package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;

public class Solution44 { // 정수 내림차순으로 배치하기 - https://programmers.co.kr/learn/courses/30/lessons/12933?language=java
    public static void main(String[] args) {
        long n = 118372;
        System.out.println(solution(n));
    }

    public static long solution(long n) {
        long answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (n != 0){
            list.add((int)(n%10));
            n /= 10;
        }
        Collections.sort(list,Collections.reverseOrder());
        for (int i: list) {
            answer *= 10;
            answer += i;
        }
        return answer;
        /*
        String[] s = (n + "").split("");
        StringBuffer sb = new StringBuffer();

        Arrays.sort(s,Collections.reverseOrder());
        Arrays.stream(s).forEach(sb::append);


        return Long.parseLong(sb.toString());
         */
    }

}