package programmers.level1;

import java.util.Arrays;

public class Solution25 { // 비밀지도 - https://programmers.co.kr/learn/courses/30/lessons/17681?language=java
    public static void main(String[] args) {
        //int[] arr1 = {9,20,28,18,11}, arr2 = {30,1,21,17,28};
        int[] arr1 = {46,33,33,22,31,50}, arr2 = {27,56,19,14,14,10};
        System.out.println(Arrays.toString(solution(6,arr1,arr2)));
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String s;
        for (int i = 0; i < n; i++){
            /*
            answer[i] = String.format("%"+n+"s",Integer.toBinaryString(arr1[i]|arr2[i]))
                              .replaceAll("0"," ")
                              .replaceAll("1","#");
        */
            s = Integer.toBinaryString(arr1[i]|arr2[i]);
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < n; j++) {
                if(j < s.length()) sb.append(s.charAt(j)=='1'?"#":" ");
                else sb.insert(0," ");
            }
            answer[i] = String.valueOf(sb);
        }

        return answer;
    }
}
