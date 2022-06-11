package programmers.level1;

import java.util.Arrays;

public class Solution17 { // 약수의 개수와 덧셈 - https://programmers.co.kr/learn/courses/30/lessons/77884?language=java
    public static void main(String[] args) {
        int left = 13, right = 17;
        System.out.println(solution(left,right));
    }

    public static int solution(int left, int right) {
        int answer = 0;
        double sqrt;
        for (int i = left; i <= right; i++) {
            sqrt = Math.sqrt(i);
            answer += i *(sqrt != (int)sqrt ? 1 : -1);
            //answer += (sqrt != (int)sqrt ? i : -i);
        }


        return answer;
    }



}
