package programmers.level1;

import java.util.Arrays;

public class Solution23 { // 나머지가 1이 되는 수 찾기 - https://programmers.co.kr/learn/courses/30/lessons/87389?language=java
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        for (int i = 2; i < n; i++) {
            if(n % i == 1) return i;
        }

        return 2;
    }

}