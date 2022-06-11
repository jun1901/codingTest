package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution13 { // 모의고사 - https://programmers.co.kr/learn/courses/30/lessons/42840?language=java
    public static void main(String[] args) {
        int[] answers = {1,3,2,4,2};
        System.out.println(Arrays.toString(solution(answers)));
    }
    public static Object[] solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int [] p1 = {1, 2, 3, 4, 5};
        int [] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int [] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int [] count = {0, 0, 0};
        /*
        for (int i = 0,j1=0,j2=0,j3=0; i < answers.length; i++) {
            if(answers[i]==p1[i%5]) count[0]++;
            if(answers[i]==p2[i%8]) count[1]++;
            if(answers[i]==p3[i%10]) count[2]++;
        }
        */
        for (int i = 0,j1=0,j2=0,j3=0; i < answers.length; i++,j1++,j2++,j3++) {
            if(answers[i]==p1[j1]) count[0]++;
            if(answers[i]==p2[j2]) count[1]++;
            if(answers[i]==p3[j3]) count[2]++;
            if(j1 == 4) j1=-1;
            if(j2 == 7) j2=-1;
            if(j3 == 9) j3=-1;
        }

        int max = Math.max(count[0], Math.max(count[1], count[2]));
        for (int i = 0; i < 3; i++) if(max == count[i]) answer.add(i+1);


        return answer.toArray();
    }


}
