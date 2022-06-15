package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution28 { // 같은 숫자는 싫어 - https://programmers.co.kr/learn/courses/30/lessons/12906?language=java
    public static void main(String[] args) {
        int[] arr= {1,1,3,3,0,1,1};
        System.out.println(Arrays.toString(solution(arr).toArray()));

    }

    public static ArrayList<Integer> solution(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int l = arr.length;
        for (int i = 0; i < l-1; i++) if(arr[i] != arr[i+1]) list.add(arr[i]);
        list.add(arr[l-1]);

        return list;
    }

}