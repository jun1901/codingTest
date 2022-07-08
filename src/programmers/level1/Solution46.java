package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

public class Solution46 { // 제일 작은 수 제거하기 - https://programmers.co.kr/learn/courses/30/lessons/12935?language=java
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,1};
        System.out.println(solution(arr));
    }

    public static ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int l = arr.length, index=0, min = Integer.MAX_VALUE;

        if(l <= 1) answer.add(-1);
        else{
            for (int i = 0; i < l; i++) {
                answer.add(arr[i]);
                if(min > arr[i]){
                    min = arr[i];
                    index = i;
                }
            }
            answer.remove(index);
            /*
            for (int i: arr) answer.add(i);

            Integer min = Collections.min(answer);
            answer.remove(min);
             */
        }


        return answer;
    }

}