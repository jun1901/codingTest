package programmers.level2;

import java.util.*;

public class Solution7 { // 기능개발 - https://programmers.co.kr/learn/courses/30/lessons/42586?language=java
    public static void main(String[] args) {
        int[] progresses = {99,99,99}, speeds = {1,1,1};
        System.out.println(solution(progresses,speeds));
    }
    public static ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        int l = progresses.length, day = 0, count = 1, max = (int)Math.ceil((100-progresses[0])/(float)speeds[0]);

        for (int i = 1; i < l; i++) {
            day = (int)Math.ceil((100-progresses[i])/(float)speeds[i]);
            //System.out.printf("max : %d, day : %d\n",max,day);
            if(max >= day) count++;
            else{
                answer.add(count);
                max = day;
                count = 1;
            }
        }
        answer.add(count);

        return answer;
    }

}