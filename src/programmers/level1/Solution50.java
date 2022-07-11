package programmers.level1;

import java.util.Arrays;

public class Solution50 { // 평균 구하기 - https://programmers.co.kr/learn/courses/30/lessons/12944?language=java
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(solution(arr));
    }

    public static double solution(int[] arr) {
        double answer = 0;
        for (int n: arr) answer += n;
        return answer / arr.length;
        //return (double) Arrays.stream(arr).sum() /arr.length;
    }

}