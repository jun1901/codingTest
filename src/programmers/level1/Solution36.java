package programmers.level1;

import java.util.Arrays;
import java.util.Map;

public class Solution36 { //소수찾기 - https://programmers.co.kr/learn/courses/30/lessons/12921?language=java
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        int answer = n-1, sqrt;
        boolean[] sw = new boolean[n-1];
        for (int i = 4; i <= n; i++) {
            sqrt = (int)Math.sqrt(i);
            for (int j = 2; j <= sqrt; j++) {
                if(!sw[j-2] && i%j == 0){
                    sw[i-2] = true;
                    answer--;
                    break;
                }
            }
        }


        return answer;
    }

}