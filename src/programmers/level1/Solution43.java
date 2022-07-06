package programmers.level1;

import java.util.Arrays;

public class Solution43 { // 자연수 뒤집어 배열로 만들기 - https://programmers.co.kr/learn/courses/30/lessons/12932?language=java
    public static void main(String[] args) {
        long n = 12345;
        System.out.println(Arrays.toString(solution(n)));
    }

    public static String[] solution(long n) {
        StringBuffer sb = new StringBuffer(n+"");
        sb.reverse();


        return sb.toString().split("");
    }
    /*
    public static int[] solution(long n) {
        int l = (n + "").length();
        int[] answer = new int[l];
        for (int i = 0; i < l; i++) {
            answer[i] = (int)(n%10);
            n /= 10;
        }

        return answer;
    }
     */

}