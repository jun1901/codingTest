package programmers.level1;

import java.util.Arrays;

public class Solution35 { // 서울에서 김서방 찾기 - https://programmers.co.kr/learn/courses/30/lessons/12919?language=java
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        System.out.println(solution(seoul));
    }

    public static String solution(String[] seoul) {
        return String.format("김서방은 %d에 있다",Arrays.asList(seoul).indexOf("Kim"));
        /*
        int l = seoul.length;
        for (int i = 0; i < l; i++) if(seoul[i].equals("Kim")) return String.format("김서방은 %d에 있다",i);
        return "";
         */
        /*
        int l = seoul.length;
        for (int i = 0; i < l; i++) if(seoul[i].equals("Kim")) return "김서방은 "+ i +"에 있다";
        return "";
         */
        //return "김서방은 "+ Arrays.asList(seoul).indexOf("Kim") +"에 있다";
    }

}