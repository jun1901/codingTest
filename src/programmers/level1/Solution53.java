package programmers.level1;

import java.util.Arrays;

public class Solution53 { // 행렬의 덧셈 - https://programmers.co.kr/learn/courses/30/lessons/12950?language=java
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {2, 3}}, arr2 = {{3, 4}, {5, 6}};
        System.out.println(Arrays.deepToString(solution(arr1, arr2)));
    }
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = arr1;
        for(int i = 0; i < arr1.length; i++)
            for(int j = 0; j < arr1[i].length; j++)
                answer[i][j] += arr2[i][j];
        return answer;
    }

}