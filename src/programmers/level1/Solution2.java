package programmers.level1;

import java.util.Arrays;

public class Solution2 { // 로또의 최고 순위와 최저 순위 - https://programmers.co.kr/learn/courses/30/lessons/77484?language=java
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25}, win_nums = {31, 10, 45, 1, 6, 19};
        System.out.println(Arrays.toString(solution(lottos,win_nums)));
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        for (int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0) answer[0]++;
            else
                for (int j = 0; j < win_nums.length; j++) {
                    if(lottos[i] == win_nums[j]){
                        answer[0]++;
                        answer[1]++;
                        break;
                    }
                }
        }
        for (int i = 0; i < 2; i++) {
            answer[i] = 7 - answer[i];
            if(answer[i] > 6) answer[i] = 6;
        }

        return answer;
    }


}
