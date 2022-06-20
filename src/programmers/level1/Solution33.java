package programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class Solution33 { // 문자열 내림차순으로 배치하기 - https://programmers.co.kr/learn/courses/30/lessons/12917?language=java
    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println(solution(s));
    }

    public static StringBuffer solution(String s) {
        /*
        StringBuffer sb = new StringBuffer();
        String[] split = s.split("");
        Arrays.sort(split,Collections.reverseOrder());
        for (String c: split) sb.append(c);

        return sb;
        */
        char[] split = s.toCharArray();
        Arrays.sort(split);

        return new StringBuffer(new String(split)).reverse();
    }

}