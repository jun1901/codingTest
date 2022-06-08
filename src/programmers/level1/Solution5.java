package programmers.level1;

import java.util.Arrays;

public class Solution5 { // 키패드 누르기 - https://programmers.co.kr/learn/courses/30/lessons/67256?language=java
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(solution(numbers,hand));
    }

    public static String solution(int[] numbers, String hand) {
        StringBuffer answer = new StringBuffer();
        String L = "147", R = "369";
        int[][] numpadPos = {
                {1,3}, //0
                {0,0}, //1
                {1,0}, //2
                {2,0}, //3
                {0,1}, //4
                {1,1}, //5
                {2,1}, //6
                {0,2}, //7
                {1,2}, //8
                {2,2}, //9
                {0,3}, //*
                {2,3}, //#
        };
        int[] li = numpadPos[10], ri = numpadPos[11];
        int l, r, n;
        for (int i = 0; i < numbers.length; i++) {
            n = numbers[i];
            if(L.contains(n+"")) {
                answer.append("L");
                li = numpadPos[n];
            } else if(R.contains(n+"")) {
                answer.append("R");
                ri = numpadPos[n];
            } else {
                l = Math.abs(numpadPos[n][0]-li[0])+Math.abs(numpadPos[n][1]-li[1]);
                r = Math.abs(numpadPos[n][0]-ri[0])+Math.abs(numpadPos[n][1]-ri[1]);
                if(l < r || (l==r && hand.equals("left"))) {
                    li = numpadPos[n];
                    answer.append("L");
                } else {
                    ri = numpadPos[n];
                    answer.append("R");
                }
            }
        }

        /*
        StringBuffer answer = new StringBuffer();
        String L = "147", R = "369";
        int[] il = {0,3}, rl = {2,3}, ml={1,3};
        int l, r;
        System.out.printf("l : %s  r : %s\n", Arrays.toString(il),Arrays.toString(rl));
        for (int i = 0; i < numbers.length; i++) {
            if(L.contains(numbers[i]+"")) {
                answer.append("L");
                il[0] = 0;
                il[1] = numbers[i]/3;
            } else if(R.contains(numbers[i]+"")) {
                answer.append("R");
                rl[0] = 2;
                rl[1] = (numbers[i]/3)-1;
            } else {
                ml[1] = numbers[i] == 0 ? 3 : numbers[i]/3;
                l = Math.abs(ml[0]-il[0])+Math.abs(ml[1]-il[1]);
                r = Math.abs(ml[0]-rl[0])+Math.abs(ml[1]-rl[1]);
                if(l < r || (l==r && hand.equals("left"))) {
                    for (int j = 0; j < 2; j++) il[j] = ml[j];
                    answer.append("L");
                } else {
                    for (int j = 0; j < 2; j++) rl[j] = ml[j];
                    answer.append("R");
                }
            }
            System.out.printf("n : %d l : %s  r : %s\n\n", numbers[i], Arrays.toString(il),Arrays.toString(rl));
        }
*/
        return String.valueOf(answer);
    }


}
