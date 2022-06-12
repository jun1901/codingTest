package programmers.level1;

public class Solution22 { // 최소직사각형 - https://programmers.co.kr/learn/courses/30/lessons/86491?language=java
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution(sizes));
    }

    public static int solution(int[][] sizes) {
        int [] answer = {0, 0};
        for (int i = 0; i < sizes.length; i++) {
            if(sizes[i][0]>sizes[i][1]) {
                answer[0] = Math.max(answer[0], sizes[i][0]);
                answer[1] = Math.max(answer[1], sizes[i][1]);
            } else{
                answer[0] = Math.max(answer[0], sizes[i][1]);
                answer[1] = Math.max(answer[1], sizes[i][0]);
            }
        }

        return answer[0]*answer[1];
    }

}